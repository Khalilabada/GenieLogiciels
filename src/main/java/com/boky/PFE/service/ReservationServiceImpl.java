package com.boky.PFE.service;

import com.boky.PFE.Beans.ReservationRQ;
import com.boky.PFE.entite.Annonce;
import com.boky.PFE.entite.Reservation;
import com.boky.PFE.entite.Utilisateur;
import com.boky.PFE.repository.ReservationRepository;
import pattern.observer.ReservationObserver;
import pattern.observer.ReservationSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService, ReservationSubject {
    
    @Autowired
    AnnonceService annonceService;
    
    @Autowired
    UtilisateurService utilisateurService;

    @Autowired
    ReservationRepository reservationRepository;
    
    private List<ReservationObserver> observers = new ArrayList<>();
    
    @Override
    public void attach(ReservationObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
            System.out.println("[Observer] + Attaché: " + observer.getClass().getSimpleName());
        }
    }
    
    @Override
    public void detach(ReservationObserver observer) {
        observers.remove(observer);
        System.out.println("[Observer] - Détaché: " + observer.getClass().getSimpleName());
    }
    
    @Override
    public void notifyObservers(Reservation reservation, String evenementType) {
        System.out.println("[Observer] Notification à " + observers.size() + " observateur(s) - Événement: " + evenementType);
        for (ReservationObserver observer : observers) {
            try {
                observer.update(reservation, evenementType);
            } catch (Exception e) {
                System.err.println("[Observer] Erreur dans " + observer.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
    
    @Override
    public Reservation AjouterReservation(ReservationRQ model) {
        System.out.println("[ReservationService] Création d'une nouvelle réservation");
        
        Reservation reservation = ReservationRQ.toEntity(model);
        Optional<Annonce> annonceOpt = annonceService.getAnnonceById(model.getId_annonce());
        Optional<Utilisateur> utilisateurOpt = utilisateurService.getUtilisateurById(model.getId_client());

        if (annonceOpt.isPresent() && utilisateurOpt.isPresent()) {
            Annonce annonce = annonceOpt.get();
            Utilisateur utilisateur = utilisateurOpt.get();
            
            reservation.setAnnonce(annonce);
            reservation.setUtilisateur(utilisateur);
            
            int nbNuits = (int) model.getNb_nuit();
            double prixTotal = annonce.calculerPrixTotal(nbNuits);
            reservation.setMontant_paye((long) prixTotal);
            
            Reservation savedReservation = reservationRepository.save(reservation);
            
            notifyObservers(savedReservation, "CREATE");
            
            System.out.println("[ReservationService] Réservation créée avec succès. ID: " + savedReservation.getId());
            return savedReservation;
        } else {
            System.err.println("[ReservationService] Erreur: Annonce ou utilisateur non trouvé");
            return null;
        }
    }

    @Override
    public List<Reservation> AfficherReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public List<Reservation> listeReservationByUtilisateur(Long id) {
        return reservationRepository.findByutilisateurId(id);
    }

    @Override
    public Utilisateur ClientByReservation(Long id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.map(Reservation::getUtilisateur).orElse(null);
    }
    
    @Override
    public Annonce AnnonceByReservation(Long id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.map(Reservation::getAnnonce).orElse(null);
    }

    @Override
    public Reservation ModifierReservation(Reservation reservation) {
        System.out.println("[ReservationService] Modification de la réservation ID: " + reservation.getId());
        
        Optional<Reservation> reservationOptional = this.getReservationById(reservation.getId());
        if (!reservationOptional.isPresent()) {
            throw new NoSuchElementException("Reservation non trouvée avec l'id: " + reservation.getId());
        }
        
        reservation.setEtat(true);
        String eventType = reservation.isConfirmation() ? "CONFIRM" : "UPDATE";
        
        Reservation updatedReservation = reservationRepository.save(reservation);
        notifyObservers(updatedReservation, eventType);
        
        return updatedReservation;
    }
    
    @Override
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }
    
    @Override
    public List<Reservation> listReservationByAnnonceur(Long idAnnonceur) {
        List<Annonce> annonces = annonceService.listeAnnonceByAnnonceur(idAnnonceur);
        List<Reservation> reservations = new ArrayList<>();
        for (Annonce annonce : annonces) {
            reservations.addAll(reservationRepository.findByAnnonceId(annonce.getId()));
        }
        return reservations;
    }
    
    @Override
    public void SupprimerReservation(Long id) {
        System.out.println("[ReservationService] Suppression de la réservation ID: " + id);
        Optional<Reservation> reservationOpt = getReservationById(id);
        if (reservationOpt.isPresent()) {
            reservationRepository.deleteById(id);
            notifyObservers(reservationOpt.get(), "DELETE");
        }
    }
}
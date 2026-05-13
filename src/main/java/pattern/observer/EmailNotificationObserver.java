package pattern.observer;

import com.boky.PFE.entite.Reservation;
import com.boky.PFE.entite.Utilisateur;
import com.boky.PFE.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationObserver implements ReservationObserver {
 
    @Autowired
    private EmailService emailService;
    
    @Override
    public void update(Reservation reservation, String evenementType) {
        
        if (!"CREATE".equals(evenementType)) {
            return;
        }
        
        Utilisateur annonceur = reservation.getAnnonce().getAnnonceur();  // ← CORRIGÉ
        Utilisateur client = reservation.getUtilisateur();  // ← CORRECT
        
        // Email à l'annonceur
        emailService.SendSimpleMessage(
            annonceur.getEmail(),
            "Nouvelle réservation - Boky",
            "Bonjour " + annonceur.getNom() + ",\n\n" +
            "Votre annonce \"" + reservation.getAnnonce().getTitre() + "\" a été réservée.\n" +
            "Montant total: " + reservation.getMontant_paye() + "€\n\n" +
            "Cordialement,\nL'équipe Boky"
        );
        
        // Email au client
        emailService.SendSimpleMessage(
            client.getEmail(),
            "Confirmation de réservation - Boky",
            "Bonjour " + client.getNom() + ",\n\n" +
            "Votre réservation pour \"" + reservation.getAnnonce().getTitre() + "\" a été enregistrée.\n" +
            "Montant: " + reservation.getMontant_paye() + "€\n\n" +
            "Cordialement,\nL'équipe Boky"
        );
    }
}
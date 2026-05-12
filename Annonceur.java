import java.util.Date;

public class Annonceur extends Client {

    public Annonceur() {}

    public Annonceur(Long id, String nom, String prenom, String email,
                     Date dateDeNaissance, String telephone, String adresse,
                     String motDePasse, String role, Boolean etat, String image, Code idCode) {
        super(id, nom, prenom, email, dateDeNaissance, telephone, adresse,
              motDePasse, role, etat, image, idCode);
    }

    public void consulterReservations() {
        System.out.println("Consultation des réservations de l'annonceur : " + getNom());
    }

    public void gererAnnonce(Annonce annonce) {
        System.out.println("Gestion annonce : " + annonce.getTitre());
    }

    public void confirmerReservation(ReserverHebergement reservation) {
        System.out.println("Confirmation de la réservation id : " + reservation.getId());
    }
}

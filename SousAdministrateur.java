import java.util.Date;

public class SousAdministrateur extends Utilisateur {

    public SousAdministrateur() {}

    public SousAdministrateur(Long id, String nom, String prenom, String email,
                               Date dateDeNaissance, String telephone, String adresse,
                               String motDePasse, String role, Boolean etat, String image, Code idCode) {
        super(id, nom, prenom, email, dateDeNaissance, telephone, adresse,
              motDePasse, role, etat, image, idCode);
    }

    @Override
    public void connecter() {
        System.out.println("Connexion du sous-administrateur : " + getEmail());
    }

    public void consulterStatistique() {
        System.out.println("Consultation des statistiques.");
    }

    public void gererMessage(Message message) {
        System.out.println("Gestion du message : " + message.getSujet());
    }

    public void gererAnnonce(Annonce annonce) {
        System.out.println("Gestion de l'annonce : " + annonce.getTitre());
    }

    public void consulterReserverPlanification(ReserverPlanification rp) {
        System.out.println("Consultation réservation planification id : " + rp.getId());
    }

    public void consulterReserverHebergement(ReserverHebergement rh) {
        System.out.println("Consultation réservation hébergement id : " + rh.getId());
    }
}

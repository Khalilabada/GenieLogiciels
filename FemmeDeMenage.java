import java.util.Date;

public class FemmeDeMenage extends Utilisateur {
    private Long id;

    public FemmeDeMenage() {}

    public FemmeDeMenage(Long id, String nom, String prenom, String email,
                          Date dateDeNaissance, String telephone, String adresse,
                          String motDePasse, String role, Boolean etat, String image, Code idCode) {
        super(id, nom, prenom, email, dateDeNaissance, telephone, adresse,
              motDePasse, role, etat, image, idCode);
        this.id = id;
    }

    public Long getFdmId() { return id; }
    public void setFdmId(Long id) { this.id = id; }

    public void chercher() {
        System.out.println("Recherche de femmes de ménage disponibles.");
    }

    public void gererPlanification(Planification planification) {
        System.out.println("Gestion de la planification id : " + planification.getId());
    }

    public void confirmerReservation(ReserverPlanification reservation) {
        System.out.println("Confirmation réservation planification id : " + reservation.getId());
    }
}

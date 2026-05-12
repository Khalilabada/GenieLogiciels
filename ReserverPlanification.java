import java.util.Date;

public class ReserverPlanification {
    private int id;
    private int idReservateur;
    private int idPlanification;
    private Date date;
    private int montantPayee;
    private Boolean etat;
    private Boolean confirmation;

    public ReserverPlanification() {}

    public ReserverPlanification(int id, int idReservateur, int idPlanification,
                                  Date date, int montantPayee, Boolean etat, Boolean confirmation) {
        this.id = id;
        this.idReservateur = idReservateur;
        this.idPlanification = idPlanification;
        this.date = date;
        this.montantPayee = montantPayee;
        this.etat = etat;
        this.confirmation = confirmation;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdReservateur() { return idReservateur; }
    public void setIdReservateur(int idReservateur) { this.idReservateur = idReservateur; }

    public int getIdPlanification() { return idPlanification; }
    public void setIdPlanification(int idPlanification) { this.idPlanification = idPlanification; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getMontantPayee() { return montantPayee; }
    public void setMontantPayee(int montantPayee) { this.montantPayee = montantPayee; }

    public Boolean getEtat() { return etat; }
    public void setEtat(Boolean etat) { this.etat = etat; }

    public Boolean getConfirmation() { return confirmation; }
    public void setConfirmation(Boolean confirmation) { this.confirmation = confirmation; }

    // Methods
    public void ajouterReservation(ReserverPlanification reservation) {
        System.out.println("Ajout réservation planification id : " + reservation.getIdPlanification());
    }

    public void afficherReservation() {
        System.out.println("Affichage réservation planification id : " + id);
    }

    public void modifierReservation(ReserverPlanification reservation, int idReservation) {
        System.out.println("Modification réservation planification id : " + idReservation);
    }

    public void annulerReservation(int idReservation) {
        this.etat = false;
        System.out.println("Annulation réservation planification id : " + idReservation);
    }

    public void confirmationReservation() {
        this.confirmation = true;
        System.out.println("Confirmation réservation planification id : " + id);
    }
}

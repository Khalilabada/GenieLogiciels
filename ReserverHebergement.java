import java.util.Date;

public class ReserverHebergement {
    private int id;
    private int idReservateur;
    private int idAnnonce;
    private int nbJour;
    private Date dateArrivee;
    private Date dateDepart;
    private int montantPayee;
    private Date date;
    private Boolean etat;
    private Boolean confirmation;

    public ReserverHebergement() {}

    public ReserverHebergement(int id, int idReservateur, int idAnnonce, int nbJour,
                                Date dateArrivee, Date dateDepart, int montantPayee,
                                Date date, Boolean etat, Boolean confirmation) {
        this.id = id;
        this.idReservateur = idReservateur;
        this.idAnnonce = idAnnonce;
        this.nbJour = nbJour;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.montantPayee = montantPayee;
        this.date = date;
        this.etat = etat;
        this.confirmation = confirmation;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdReservateur() { return idReservateur; }
    public void setIdReservateur(int idReservateur) { this.idReservateur = idReservateur; }

    public int getIdAnnonce() { return idAnnonce; }
    public void setIdAnnonce(int idAnnonce) { this.idAnnonce = idAnnonce; }

    public int getNbJour() { return nbJour; }
    public void setNbJour(int nbJour) { this.nbJour = nbJour; }

    public Date getDateArrivee() { return dateArrivee; }
    public void setDateArrivee(Date dateArrivee) { this.dateArrivee = dateArrivee; }

    public Date getDateDepart() { return dateDepart; }
    public void setDateDepart(Date dateDepart) { this.dateDepart = dateDepart; }

    public int getMontantPayee() { return montantPayee; }
    public void setMontantPayee(int montantPayee) { this.montantPayee = montantPayee; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Boolean getEtat() { return etat; }
    public void setEtat(Boolean etat) { this.etat = etat; }

    public Boolean getConfirmation() { return confirmation; }
    public void setConfirmation(Boolean confirmation) { this.confirmation = confirmation; }

    // Methods
    public void ajouterReservation(ReserverHebergement reservation) {
        System.out.println("Ajout réservation hébergement pour annonce id : " + reservation.getIdAnnonce());
    }

    public void afficherReservation() {
        System.out.println("Affichage réservation id : " + id);
    }

    public void supprimerReservation(int idReservation) {
        System.out.println("Suppression réservation id : " + idReservation);
    }

    public void confirmationReservation() {
        this.confirmation = true;
        System.out.println("Réservation confirmée : id = " + id);
    }
}

import java.util.Date;

public class Planification {
    private int id;
    private int idFemmeDM;
    private Date jourDisponible;
    private Date heureDisponible;
    private String gouvernorat;
    private String adresse;
    private float prixParHeure;

    public Planification() {}

    public Planification(int id, int idFemmeDM, Date jourDisponible, Date heureDisponible,
                          String gouvernorat, String adresse, float prixParHeure) {
        this.id = id;
        this.idFemmeDM = idFemmeDM;
        this.jourDisponible = jourDisponible;
        this.heureDisponible = heureDisponible;
        this.gouvernorat = gouvernorat;
        this.adresse = adresse;
        this.prixParHeure = prixParHeure;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdFemmeDM() { return idFemmeDM; }
    public void setIdFemmeDM(int idFemmeDM) { this.idFemmeDM = idFemmeDM; }

    public Date getJourDisponible() { return jourDisponible; }
    public void setJourDisponible(Date jourDisponible) { this.jourDisponible = jourDisponible; }

    public Date getHeureDisponible() { return heureDisponible; }
    public void setHeureDisponible(Date heureDisponible) { this.heureDisponible = heureDisponible; }

    public String getGouvernorat() { return gouvernorat; }
    public void setGouvernorat(String gouvernorat) { this.gouvernorat = gouvernorat; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public float getPrixParHeure() { return prixParHeure; }
    public void setPrixParHeure(float prixParHeure) { this.prixParHeure = prixParHeure; }

    // Methods
    public void modifierPlanification(Planification planification, int idPlanification) {
        System.out.println("Modification planification id : " + idPlanification);
    }

    public void consulterPlanification() {
        System.out.println("Consultation des planifications.");
    }

    public void ajouterPlanification(Planification planification) {
        System.out.println("Ajout planification gouvernorat : " + planification.getGouvernorat());
    }

    public void supprimerPlanification(int idPlanification) {
        System.out.println("Suppression planification id : " + idPlanification);
    }

    public void chercher() {
        System.out.println("Recherche de planifications disponibles.");
    }
}

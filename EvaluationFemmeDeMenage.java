import java.util.Date;

// ============================================================
// EvaluationFemmeDeMenage.java
// ============================================================
public class EvaluationFemmeDeMenage {
    private int id;
    private int idInternaute;
    private int idFemmeDeMenage;
    private double star;
    private Date date;

    public EvaluationFemmeDeMenage() {}

    public EvaluationFemmeDeMenage(int id, int idInternaute, int idFemmeDeMenage,
                                    double star, Date date) {
        this.id = id;
        this.idInternaute = idInternaute;
        this.idFemmeDeMenage = idFemmeDeMenage;
        this.star = star;
        this.date = date;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdInternaute() { return idInternaute; }
    public void setIdInternaute(int idInternaute) { this.idInternaute = idInternaute; }

    public int getIdFemmeDeMenage() { return idFemmeDeMenage; }
    public void setIdFemmeDeMenage(int idFemmeDeMenage) { this.idFemmeDeMenage = idFemmeDeMenage; }

    public double getStar() { return star; }
    public void setStar(double star) { this.star = star; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    // Methods
    public void ajouterEvaluation() {
        System.out.println("Ajout évaluation femme de ménage id : " + idFemmeDeMenage + " - Note : " + star);
    }

    public void supprimerEvaluation(int idEvaluation) {
        System.out.println("Suppression évaluation id : " + idEvaluation);
    }

    public void consulterEvaluation() {
        System.out.println("Consultation évaluation femme de ménage id : " + idFemmeDeMenage);
    }
}

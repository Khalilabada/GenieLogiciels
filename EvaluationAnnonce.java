import java.util.Date;

public class EvaluationAnnonce {
    private int id;
    private int idClient;
    private int idAnnonce;
    private String commentaire;
    private Date date;

    public EvaluationAnnonce() {}

    public EvaluationAnnonce(int id, int idClient, int idAnnonce,
                              String commentaire, Date date) {
        this.id = id;
        this.idClient = idClient;
        this.idAnnonce = idAnnonce;
        this.commentaire = commentaire;
        this.date = date;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdClient() { return idClient; }
    public void setIdClient(int idClient) { this.idClient = idClient; }

    public int getIdAnnonce() { return idAnnonce; }
    public void setIdAnnonce(int idAnnonce) { this.idAnnonce = idAnnonce; }

    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    // Methods
    public void ajouterEvaluation() {
        System.out.println("Ajout évaluation annonce id : " + idAnnonce);
    }

    public void supprimerEvaluation(int idEvaluation) {
        System.out.println("Suppression évaluation id : " + idEvaluation);
    }

    public void consulterListeEvaluation() {
        System.out.println("Consultation liste évaluations annonce id : " + idAnnonce);
    }
}

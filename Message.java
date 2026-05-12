import java.util.Date;

public class Message {
    private String sujet;
    private String message;
    private String telephone;
    private Date date;
    private String email;
    private String repondre;

    public Message() {}

    public Message(String sujet, String message, String telephone,
                   Date date, String email, String repondre) {
        this.sujet = sujet;
        this.message = message;
        this.telephone = telephone;
        this.date = date;
        this.email = email;
        this.repondre = repondre;
    }

    // Getters & Setters
    public String getSujet() { return sujet; }
    public void setSujet(String sujet) { this.sujet = sujet; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRepondre() { return repondre; }
    public void setRepondre(String repondre) { this.repondre = repondre; }

    // Methods
    public void consulterContact() {
        System.out.println("Consultation du contact : " + sujet);
    }

    public void supprimerContact(int id) {
        System.out.println("Suppression du contact avec id : " + id);
    }

    public void ajouterContact(Message contact) {
        System.out.println("Ajout du contact : " + contact.getSujet());
    }

    public void repondreContact(Message contact, int id) {
        System.out.println("Réponse au contact id : " + id);
    }
}

import java.util.Date;

public class MessageChat {
    private String expediteurEmail;
    private Date temps;
    private String message;
    private int idChat;

    public MessageChat() {}

    public MessageChat(String expediteurEmail, Date temps, String message, int idChat) {
        this.expediteurEmail = expediteurEmail;
        this.temps = temps;
        this.message = message;
        this.idChat = idChat;
    }

    // Getters & Setters
    public String getExpediteurEmail() { return expediteurEmail; }
    public void setExpediteurEmail(String expediteurEmail) { this.expediteurEmail = expediteurEmail; }

    public Date getTemps() { return temps; }
    public void setTemps(Date temps) { this.temps = temps; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public int getIdChat() { return idChat; }
    public void setIdChat(int idChat) { this.idChat = idChat; }

    // Methods
    public void ajouterMessage(MessageChat message) {
        System.out.println("Ajout message de : " + message.getExpediteurEmail());
    }

    public void getAllMessagesInChat(int idChat) {
        System.out.println("Récupération de tous les messages du chat id : " + idChat);
    }
}

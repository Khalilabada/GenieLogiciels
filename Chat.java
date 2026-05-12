import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// ============================================================
// Chat.java
// ============================================================
public class Chat {
    private int id;
    private String nom1;
    private String nom2;
    private List<MessageChat> listMessage;

    public Chat() {
        this.listMessage = new ArrayList<>();
    }

    public Chat(int id, String nom1, String nom2) {
        this.id = id;
        this.nom1 = nom1;
        this.nom2 = nom2;
        this.listMessage = new ArrayList<>();
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom1() { return nom1; }
    public void setNom1(String nom1) { this.nom1 = nom1; }

    public String getNom2() { return nom2; }
    public void setNom2(String nom2) { this.nom2 = nom2; }

    public List<MessageChat> getListMessage() { return listMessage; }
    public void setListMessage(List<MessageChat> listMessage) { this.listMessage = listMessage; }

    // Methods
    public void ajouterChat(Chat chat) {
        System.out.println("Ajout chat entre : " + chat.getNom1() + " et " + chat.getNom2());
    }

    public void afficherChat() {
        System.out.println("Affichage du chat entre : " + nom1 + " et " + nom2);
        for (MessageChat msg : listMessage) {
            System.out.println("  [" + msg.getTemps() + "] " + msg.getExpediteurEmail() + " : " + msg.getMessage());
        }
    }

    public void chercher() {
        System.out.println("Recherche de chat.");
    }
}

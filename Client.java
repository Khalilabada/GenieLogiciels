import java.util.Date;

public class Client extends Utilisateur {

    public Client() {}

    public Client(Long id, String nom, String prenom, String email,
                  Date dateDeNaissance, String telephone, String adresse,
                  String motDePasse, String role, Boolean etat, String image, Code idCode) {
        super(id, nom, prenom, email, dateDeNaissance, telephone, adresse,
              motDePasse, role, etat, image, idCode);
    }

    public void inscription() {
        System.out.println("Inscription du client : " + getNom() + " " + getPrenom());
    }
}

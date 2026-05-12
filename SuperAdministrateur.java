import java.util.Date;

public class SuperAdministrateur extends SousAdministrateur {

    public SuperAdministrateur() {}

    public SuperAdministrateur(Long id, String nom, String prenom, String email,
                                Date dateDeNaissance, String telephone, String adresse,
                                String motDePasse, String role, Boolean etat, String image, Code idCode) {
        super(id, nom, prenom, email, dateDeNaissance, telephone, adresse,
              motDePasse, role, etat, image, idCode);
    }

    public void ajouterAdmin(SousAdministrateur admin) {
        System.out.println("Ajout de l'administrateur : " + admin.getNom());
    }

    public void consulterAdmin() {
        System.out.println("Consultation des administrateurs.");
    }

    public void supprimerAdmin(int id) {
        System.out.println("Suppression de l'administrateur avec id : " + id);
    }

    public void modifierAdmin(SousAdministrateur admin) {
        System.out.println("Modification de l'administrateur : " + admin.getNom());
    }
}

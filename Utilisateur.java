import java.util.Date;

public class Utilisateur {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Date dateDeNaissance;
    private String telephone;
    private String adresse;
    private String motDePasse;
    private String role;
    private Boolean etat;
    private String image;
    private Code idCode;

    public Utilisateur() {}

    public Utilisateur(Long id, String nom, String prenom, String email,
                       Date dateDeNaissance, String telephone, String adresse,
                       String motDePasse, String role, Boolean etat, String image, Code idCode) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.telephone = telephone;
        this.adresse = adresse;
        this.motDePasse = motDePasse;
        this.role = role;
        this.etat = etat;
        this.image = image;
        this.idCode = idCode;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getDateDeNaissance() { return dateDeNaissance; }
    public void setDateDeNaissance(Date dateDeNaissance) { this.dateDeNaissance = dateDeNaissance; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Boolean getEtat() { return etat; }
    public void setEtat(Boolean etat) { this.etat = etat; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public Code getIdCode() { return idCode; }
    public void setIdCode(Code idCode) { this.idCode = idCode; }

    // Methods
    public void consulterUtilisateur() {
        System.out.println("Consultation de l'utilisateur : " + nom + " " + prenom);
    }

    public void connecter() {
        System.out.println("Connexion de l'utilisateur : " + email);
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        System.out.println("Ajout de l'utilisateur : " + utilisateur.getNom());
    }

    public void supprimerUtilisateur(int id) {
        System.out.println("Suppression de l'utilisateur avec id : " + id);
    }

    public void modifierUtilisateur(Utilisateur utilisateur, int id) {
        System.out.println("Modification de l'utilisateur avec id : " + id);
    }

    public void reinitalisationMotDePasse() {
        System.out.println("Réinitialisation du mot de passe pour : " + email);
    }
}

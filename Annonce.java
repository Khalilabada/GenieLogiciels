import java.util.Date;
import java.util.List;

public class Annonce {
    private String typeDHebergement;
    private int nbVoyageur;
    private int nbChambre;
    private int nbLits;
    private int nbSallesDeBain;
    private List<String> equipement;
    private List<String> equipementSpecial;
    private List<String> equipementDeSecurite;
    private String image;
    private String titre;
    private String description;
    private Boolean reductionSemaine;
    private Boolean reductionMois;
    private float prix;
    private String pays;
    private Boolean etat;
    private String ville;
    private String codePostale;
    private Date heureDArrivee;
    private Date heureDepart;
    private long idAnnonceur;
    private Boolean verification;
    private Boolean accordeUser;
    private Date dateCreation;

    public Annonce() {}

    // Getters & Setters
    public String getTypeDHebergement() { return typeDHebergement; }
    public void setTypeDHebergement(String typeDHebergement) { this.typeDHebergement = typeDHebergement; }

    public int getNbVoyageur() { return nbVoyageur; }
    public void setNbVoyageur(int nbVoyageur) { this.nbVoyageur = nbVoyageur; }

    public int getNbChambre() { return nbChambre; }
    public void setNbChambre(int nbChambre) { this.nbChambre = nbChambre; }

    public int getNbLits() { return nbLits; }
    public void setNbLits(int nbLits) { this.nbLits = nbLits; }

    public int getNbSallesDeBain() { return nbSallesDeBain; }
    public void setNbSallesDeBain(int nbSallesDeBain) { this.nbSallesDeBain = nbSallesDeBain; }

    public List<String> getEquipement() { return equipement; }
    public void setEquipement(List<String> equipement) { this.equipement = equipement; }

    public List<String> getEquipementSpecial() { return equipementSpecial; }
    public void setEquipementSpecial(List<String> equipementSpecial) { this.equipementSpecial = equipementSpecial; }

    public List<String> getEquipementDeSecurite() { return equipementDeSecurite; }
    public void setEquipementDeSecurite(List<String> equipementDeSecurite) { this.equipementDeSecurite = equipementDeSecurite; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Boolean getReductionSemaine() { return reductionSemaine; }
    public void setReductionSemaine(Boolean reductionSemaine) { this.reductionSemaine = reductionSemaine; }

    public Boolean getReductionMois() { return reductionMois; }
    public void setReductionMois(Boolean reductionMois) { this.reductionMois = reductionMois; }

    public float getPrix() { return prix; }
    public void setPrix(float prix) { this.prix = prix; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public Boolean getEtat() { return etat; }
    public void setEtat(Boolean etat) { this.etat = etat; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getCodePostale() { return codePostale; }
    public void setCodePostale(String codePostale) { this.codePostale = codePostale; }

    public Date getHeureDArrivee() { return heureDArrivee; }
    public void setHeureDArrivee(Date heureDArrivee) { this.heureDArrivee = heureDArrivee; }

    public Date getHeureDepart() { return heureDepart; }
    public void setHeureDepart(Date heureDepart) { this.heureDepart = heureDepart; }

    public long getIdAnnonceur() { return idAnnonceur; }
    public void setIdAnnonceur(long idAnnonceur) { this.idAnnonceur = idAnnonceur; }

    public Boolean getVerification() { return verification; }
    public void setVerification(Boolean verification) { this.verification = verification; }

    public Boolean getAccordeUser() { return accordeUser; }
    public void setAccordeUser(Boolean accordeUser) { this.accordeUser = accordeUser; }

    public Date getDateCreation() { return dateCreation; }
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }

    // Generated id for relations
    private int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Methods
    public void ajouterAnnonce(Annonce annonce) {
        System.out.println("Ajout annonce : " + annonce.getTitre());
    }

    public void consulterAnnonce() {
        System.out.println("Consultation des annonces.");
    }

    public void modifierAnnonce(Annonce annonce, int idAnnonce) {
        System.out.println("Modification annonce id : " + idAnnonce);
    }

    public void supprimerAnnonce(int id) {
        System.out.println("Suppression annonce id : " + id);
    }

    public void verificationAnnonce() {
        System.out.println("Vérification de l'annonce : " + titre);
    }

    public void rechercher() {
        System.out.println("Recherche d'annonces.");
    }

    public void accordePermissionAffichage() {
        System.out.println("Permission d'affichage accordée pour : " + titre);
    }
}

package Tp3_4;
import java.time.LocalDate;
import java.time.Period;
public class Employe {
	    private String matricule;
	    private String nom;
	    private String prenom;
	    private String anneeNaissance;
	    private String anneeEmbauche;
	    private double salaire;

	    // Constructeur
	    public Employe() {
	        this.matricule = "";
	        this.nom = "";
	        this.prenom ="";
	        this.anneeNaissance = "";
	        this.anneeEmbauche = "";
	        this.salaire =0.0;
	    }
	    public Employe(String matricule, String nom, String prenom, String anneeNaissance, String anneeEmbauche, double salaire) {
	        this.matricule = matricule;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.anneeNaissance = anneeNaissance;
	        this.anneeEmbauche = anneeEmbauche;
	        this.salaire = salaire;
	    }

	    // Getters et Setters
	    public String getMatricule() {
	        return matricule;
	    }

	    public void setMatricule(String matricule) {
	        this.matricule = matricule;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public String getAnneeNaissance() {
	        return anneeNaissance;
	    }

	    public void setAnneeNaissance(String anneeNaissance) {
	        this.anneeNaissance = anneeNaissance;
	    }

	    public String getAnneeEmbauche() {
	        return anneeEmbauche;
	    }

	    public void setAnneeEmbauche(String anneeEmbauche) {
	        this.anneeEmbauche = anneeEmbauche;
	    }

	    public double getSalaire() {
	        return salaire;
	    }

	    public void setSalaire(double salaire) {
	        this.salaire = salaire;
	    }
	
	public int getAnciennete() {
        LocalDate now = LocalDate.now();
        LocalDate dateEmbauche = LocalDate.parse(this.anneeEmbauche); // Supposons que l'année d'embauche soit au format YYYY-MM-DD
        Period period = Period.between(dateEmbauche, now);
        return period.getYears();
    }

    // Méthode pour calculer l'âge de l'employé
    public int getAge() {
        LocalDate now = LocalDate.now();
        LocalDate dateNaissance = LocalDate.parse(this.anneeNaissance); // Supposons que l'année de naissance soit au format YYYY-MM-DD
        Period period = Period.between(dateNaissance, now);
        return period.getYears();
    }

    // Méthode pour augmenter le salaire selon l'ancienneté
    public void augmentationDuSalaire() {
        int anciennete = getAnciennete();
        if (anciennete < 5) {
            this.salaire *= 1.02; // Augmentation de 2% si l'ancienneté est inférieure à 5 ans
        } else if (anciennete < 10) {
            this.salaire *= 1.05; // Augmentation de 5% si l'ancienneté est inférieure à 10 ans
        } else {
            this.salaire *= 1.1; // Augmentation de 10% si l'ancienneté est supérieure ou égale à 10 ans
        }
    }

    // Méthode pour afficher les informations de l'employé
    public void afficherEmploye() {
        System.out.println("Matricule : " + this.matricule);
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Année de naissance : " + this.anneeNaissance);
        System.out.println("Année d'embauche : " + this.anneeEmbauche);
        System.out.println("Salaire : " + this.salaire);
    }


	public static void main(String[] args) {
        Employe employe = new Employe("123", "Doe", "John", "1990-01-01", "2010-06-15", 2500.0);
        
        System.out.println("Ancienneté : " + employe.getAnciennete() + " ans");
        System.out.println("Âge : " + employe.getAge() + " ans");

        employe.augmentationDuSalaire();
        employe.afficherEmploye();
	}

}


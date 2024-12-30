package EX1;

public class Enseignant extends Personne{
	private String specialite;
	private static int  nbEnseignants=0;
	public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom,prenom,rue,ville);
		this.specialite=specialite;
		nbEnseignants++;
	}
	public String toString() {
		String chaine=super.toString()+"\nspecialite :"+specialite;
		return chaine;
	}
	public void EcrirePersonne() {
		System.out.println("Enseignant :");
		System.out.println(toString());
	}
	public static int nbEnseignants() {
		return nbEnseignants;
	}

}

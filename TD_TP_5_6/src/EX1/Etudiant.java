package EX1;

public class Etudiant extends Personne{
	private String diplomeEnCours;
	private static int nbEtudiants=0;
	public Etudiant(String nom, String prenom, String rue, String ville,String diplomeEnCours) {
		super(nom,prenom,rue,ville);
		this.diplomeEnCours=diplomeEnCours;
		nbEtudiants++;
	}
	public String toString() {
		String chaine=super.toString()+"\nDiplome :"+diplomeEnCours;
		return chaine;
	}
	public void EcrirePersonne() {
		System.out.println("Etudiant :");
		System.out.println(toString());
	}	
	public static int nbEtudiants() {
		return nbEtudiants;
	}

}

package EX1;

public class Secretaire extends Personne{
	private String numeroBureau;
	private static int nbSecretaires=0;
	public Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
		super(nom,prenom,rue,ville);
		this.numeroBureau=numeroBureau;
		nbSecretaires++;
	}
	public String toString() {
		String chaine=super.toString()+"\nnumeroBureau :"+numeroBureau;
		return chaine;
	}
	public void EcrirePersonne() {
		System.out.println("Secretaire :");
		System.out.println(toString());
	}
	public static int nbSecretaires() {
		return nbSecretaires;
	}
}

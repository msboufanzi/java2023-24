package EX1;

abstract class Personne {
	private String nom;
	private String prenom;
	private String rue;
	private String ville;
	private static int nbPersonne=0;
	public Personne(String nom,String prenom,String rue,String ville) {
		this.nom=nom;
		this.prenom=prenom;
		this.rue=rue;
		this.ville=ville;
		nbPersonne++;
	}
	public String toString() {
		String chaine="le nom :"+nom+"\nle prenom :"+prenom+"\nla rue :"+rue+"\nla ville :"+ville;
		return chaine;
	}
	public abstract void EcrirePersonne();
	public static void nbPersonnes() {
		System.out.println("le nombre total de personnes :"+nbPersonne);
		System.out.println("le nombre total de Secretaire :"+Secretaire.nbSecretaires());
		System.out.println("le nombre total de Enseignant :"+Enseignant.nbEnseignants());
		System.out.println("le nombre total de Etudiant :"+Etudiant.nbEtudiants());
	}
	public void modifierPersonne(String rue,String ville) {
		this.rue=rue;
		this.ville=ville;
		EcrirePersonne();
	}

}

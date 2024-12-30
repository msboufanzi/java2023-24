package EX2_partie_2;

public class Article {
	private double prixAchat;
	protected double prixVente;
	private String nom;
	private String fournisseur;
	public Article(double prixAchat,double prixVente,String nom,String fournisseur) {
		this.prixAchat=prixAchat;
		this.prixVente=prixVente;
		this.nom=nom;
		this.fournisseur=fournisseur;
	}
	public double rendement() {
		return (prixVente - prixAchat) / prixAchat * 100.0;
	}
	public String toString() {
		return "Nom: " + nom +
                "\nFournisseur: " + fournisseur +
                "\nPrix d'achat: " + prixAchat +
                "\nPrix de vente: " + prixVente +
                "\nRendement: " + rendement() + "%";
	}
}

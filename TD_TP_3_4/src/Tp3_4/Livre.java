package Tp3_4;
public class Livre {
	private String Titre;
	private String Auteur;
	private double Prix;
	 public Livre() {
	        this.Titre = "";
	        this.Auteur = "";
	        this.Prix = 0.0;
	    }	    
	    public Livre(String Titre, String Auteur, double Prix) {
	        this.Titre = Titre;
	        this.Auteur = Auteur;
	        this.Prix = Prix;
	    }
	public String getTitre() {
		return Titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public double getPrix() {
		return Prix;
	}
	public void setTitre(String Titre) {
		this.Titre=Titre;
	}
	public void setAuteur(String Auteur) {
		this.Auteur=Auteur;
	}
	public void setPrix(double Prix) {
		this.Prix=Prix;
	}
	public void afficher() {
		System.out.println("le titre de livre est : "+Titre);
		System.out.println("le nom complet de l'auteur de livre est : "+Auteur);
		System.out.println("le prix de livre est : "+Prix+"DH");
	}
	public static void main(String[] args) {
		Livre lv=new Livre("La boite a merveille","Ahmed Sefrioui",40);
		lv.afficher();
		lv.setAuteur("Vector Hugo");
		lv.setTitre("Les miserables");
		lv.setPrix(90);
		System.out.println("************Apres modification************");
		System.out.println("le titre de livre est : "+lv.getTitre());
		System.out.println("le nom complet de l'auteur de livre est : "+lv.getAuteur());
		System.out.println("le prix de livre est : "+lv.getPrix()+"DH");
	}
}

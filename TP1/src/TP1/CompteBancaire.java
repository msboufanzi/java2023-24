package TP1;
public class CompteBancaire {
    private double sold;
    //Constructeur du classe
    public  CompteBancaire(){sold=0;}
    //Methode deposer
    public void Deposer(double montant) {
    	sold+=montant;
    }
    //Methode retirer
    public void Retirer(double montant) {
    	sold-=montant;
    }
    //Affichage de l'etat du compte
    public void getsold() {
    	System.out.println("Votre sold est : "+sold+"DH");
    }
	public static void main(String[] args) {
		CompteBancaire client=new CompteBancaire();
		client.Deposer(2000);
		client.getsold();
		client.Retirer(1500);
		client.getsold();
	}
}
package EX2_partie_2;

public class ArticlePrimeur extends Article{
	private int stock;
	public ArticlePrimeur(double prixAchat,double prixVente,String nom,String fournisseur) {
		super(prixAchat,prixVente,nom,fournisseur);
		stock=0;
	}
	public String toString() {
		return super.toString()
				+"\nstock : "+stock;
	}
	public void remplirStock(double quantite) {
        this.stock += quantite;
    }

    public double vendre(double quantite) {
        if (stock >= quantite) {
            stock -= quantite;
            return prixVente * quantite;
        }
        return 0.0;
    }

}

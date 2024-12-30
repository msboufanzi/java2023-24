package EX2_partie_2;

public class ArticleElectromenager extends Article implements VendablePiece, Solde{
	private int stock;
	public ArticleElectromenager(double prixAchat,double prixVente,String nom,String fournisseur) {
		super(prixAchat,prixVente,nom,fournisseur);
		stock=0;
	}
	public String toString() {
		return super.toString()
				+"\nstock : "+stock;
	}
	public void remplirStock(int quantite) {
        this.stock += quantite;
    }

    public double vendre(int quantite) {
        if (stock >= quantite) {
            stock -= quantite;
            return prixVente * quantite;
        }
        return 0;
    }

    public void lanceSolde(double pourcentage) {
        prixVente -= (prixVente * pourcentage) / 100.0;
    }

    public void termineSolde(double pourcentage) {
        prixVente += (prixVente * pourcentage) / 100.0;
    
    }
}
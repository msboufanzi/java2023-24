package EX2;

public class Rectangle extends ObjetGraphique{
	private double largeur;
	private double hauteur;
	public Rectangle() {
		super();
		this.largeur=0;
		this.hauteur=0;
	}
	public Rectangle(int x,int y,double largeur,double hauteur) {
		super(x,y);
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	public Rectangle(Rectangle r) {
		super(r);
		this.largeur=r.largeur;
		this.hauteur=r.hauteur;
	}
	public double getHauteur() {
		return hauteur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setObjectGraphique(int x,int y,double largeur,double hauteur) {
		super.setPosition(x, y);
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	public void setTaille(double largeur,double hauteur) {
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	public void affiche() {
		System.out.println("La position est : x="+this.getX()+" y="+this.getY());
		System.out.println("La taille est :"+largeur*hauteur);
	}
}

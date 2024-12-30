package EX2;

public class Cercle extends ObjetGraphique {
	private double rayon;
	public Cercle() {
		super();
		this.rayon=0;
	}
	public Cercle(int x,int y,double rayon) {
		super(x,y);
		this.rayon=rayon;
	}
	public Cercle(Cercle c) {
		super(c);
		this.rayon=c.rayon;
	}
	public void setRayon(double rayon) {
		this.rayon=rayon;
	}
	public double getRayon() {
		return this.rayon;
	}
	public void affiche() {
		System.out.println("La position est : x="+this.getX()+" y="+this.getY());
		System.out.println("La taille est :"+rayon*rayon*3.14);
	}

}

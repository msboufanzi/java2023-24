package EX2;

abstract class ObjetGraphique {
	private int x;
	private int y;
	public ObjetGraphique() {
		this.x=0;
		this.y=0;
	}
	public ObjetGraphique(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public ObjetGraphique(ObjetGraphique g) {
		this.x=g.x;
		this.y=g.y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setPosition(int x,int y) {
		this.x+=x;
	    this.y+=y;
	}
	public void deplacer(int dx,int dy) {
		this.x+=dx;
		this.x+=dy;
	}
	public abstract void affiche();

}

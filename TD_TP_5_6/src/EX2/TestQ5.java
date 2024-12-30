package EX2;

public class TestQ5 {
	public static void main(String[] args) {
	ObjetGraphique[] tab=new ObjetGraphique[3];
	ObjetGraphique c=new Cercle(5, 6, 8);
	ObjetGraphique r=new Rectangle(4, 9, 16, 8);
	ObjetGraphique b=new Button(3, 6, 12, 4, "c'est un button");
	tab[0]=c;
	tab[1]=r;
	tab[2]=b;
	for(ObjetGraphique ele: tab) {
		ele.affiche();
	}
	}
}

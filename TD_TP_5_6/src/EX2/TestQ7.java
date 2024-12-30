package EX2;
public class TestQ7 {
	public static void main(String[] args) {
		ArrayListeObjetGraphique liste=new ArrayListeObjetGraphique();
		liste.ajouter(new Cercle(5, 6, 8));
		liste.ajouter(new Rectangle(4, 9, 16, 8));
		liste.ajouter(new Button(3, 6, 12, 4, "c'est un button"));
		liste.ajouter(new Cercle(8, 12, 2));
		liste.ajouter(new Rectangle(2, 5, 9, 12));
		liste.ajouter(new Button(4, 74, 2, 9, "c'est un button 2"));
		liste.afficheObjetsGraphique();
	}

}

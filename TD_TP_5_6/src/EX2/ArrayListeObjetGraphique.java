package EX2;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListeObjetGraphique {
	private ArrayList<ObjetGraphique> liste=new ArrayList<ObjetGraphique>(); 
	public ArrayListeObjetGraphique() { 
	} 
	public void ajouter(ObjetGraphique f) {
		liste.add(f);
	}
	public void afficheObjetsGraphique () {
		ListIterator<ObjetGraphique> index=liste.listIterator();
		int i=1;
		while(index.hasNext()) {
			ObjetGraphique o=index.next();
			System.out.println("L'objet "+i+" :");
			o.affiche();
			i++;
		}
		i=0;
	}
}

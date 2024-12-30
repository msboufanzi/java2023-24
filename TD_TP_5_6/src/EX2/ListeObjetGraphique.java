package EX2;
public class ListeObjetGraphique {
	private ObjetGraphique[] liste; // le tableau des objets
	private int taille;// la taille du tableau liste
	private static int index=0;//le nombre des éléments dans le tableau
	public ListeObjetGraphique(int taille) { 
		this.taille=taille;
		this.liste=new ObjetGraphique[taille];
	} //constructeur pour l’initialisation
	public void ajouter(ObjetGraphique f) {
		if(index<taille) {
		liste[index]=f;
		index++;}
		else
			System.out.println("le tableau est remplit !!");
	}//fonction permettant d’ajouter un objet au tableau
	public void afficheObjetsGraphique () {
		for(int i=0;i<index;i++) {
			System.out.println("L'objet "+(i+1)+" :");
			liste[i].affiche();
		}
	}//fct pour afficher les objets du tableau liste
	
}

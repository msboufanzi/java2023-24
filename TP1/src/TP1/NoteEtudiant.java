package TP1;

public class NoteEtudiant {

	public static void main(String[] args) {
		double[] noteEtud= {12,15.8,7,13.4,18,12,17.5,6,8,10};
		//calculons la moyenne du note
		double moy=0;
		for(double note : noteEtud) {
			moy+=note;
		}
		moy/=noteEtud.length;
		//le nombre d'etudiant ayant une note sup a la moyenne
		int i=0;
		for(double note : noteEtud) {
			if(note>moy)
				i++;
		}
		System.out.println("La moyenne de la classe est : "+moy);
		System.out.println("le nombre d'etudiant ayant une note sup a la moyenne : "+i);
	}

}

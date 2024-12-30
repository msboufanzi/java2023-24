package TP1;

public class Somme {

	public static void main(String[] args) {
		int i;
		int somme=0;
		//Boucle for
		for(i=1;i<=10;i++) {
			somme+=i;
		}
		System.out.println("La somme est : "+somme);
		//Boucle do...while
		somme=0;
		i=1;
		do {
			somme+=i;
			++i;
		}while(i<11);
		System.out.println("La somme est : "+somme);
		//Boucle while
		somme=0;
		i=1;
		while(i<11) {
			somme+=i;
			++i;
		}
		System.out.println("La somme est : "+somme);
	}
}

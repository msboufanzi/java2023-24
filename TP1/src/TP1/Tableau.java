package TP1;
import java.util.*;
public class Tableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("Saisir la taille du tableur: ");
		int n=sc.nextInt();
		int[] nombreT=new int[n];
		
		//Remplissage du tableau
		for(int i=0;i<n;i++) {
			System.out.println("Saisir le nombre "+(i+1)+" :");
			nombreT[i]=sc.nextInt();
		}
		//recherche le max du tableau
		int max=0;
		for(int nombre:nombreT) {
			if(nombre>max)
				max=nombre;
		}
		System.out.println("Le maximum du tableu est :"+max);
		sc.close();
	}

}

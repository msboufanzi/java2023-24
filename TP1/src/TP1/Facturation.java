package TP1;
import java.util.*;
public class Facturation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Donner le prix hors taxe en DH : ");
		double prixHT=sc.nextInt();
		//Calcul de prix TTC
		double prixTTC=prixHT+prixHT*0.186;
		System.out.println(" le prix TTC en DH avant le remise: "+prixTTC+"DH");
		//Effectuons le remise
		if(prixTTC>=1000 && prixTTC<2000) {
			prixTTC-=prixTTC*0.01;
		}
		else	if(prixTTC>=2000 && prixTTC<5000) {
			prixTTC-=prixTTC*0.03;
		}
		else if(prixTTC>=5000) {
			prixTTC-=prixTTC*0.05;
		}
		System.out.println(" le prix TTC en DH apres le remise: "+prixTTC+"DH");
		sc.close();
	}
}

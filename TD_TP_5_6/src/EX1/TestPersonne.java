package EX1;

public class TestPersonne {
	public static void main(String[] args) {
		//creation objet du classe secretaire
	Secretaire S=new Secretaire("Said", "Abidi","Rue Elamal", "Casablanca", "A123");
	//affichage des attributs 
	S.EcrirePersonne();
	//creation d'objet du classe Enseignant
	Enseignant E=new Enseignant("Ahmed", "Sbihi", "Rue Bel Air", "Fès", "Informatique");
	//affichage des attributs
	E.EcrirePersonne();
	//creation des objets du classe etudiant
	Etudiant E1=new Etudiant("Samir", "Merras", "rue saules ", "Oujda", "licence informatique");
	Etudiant E2=new Etudiant("Hamid", "Nissani", "rue d’olivier", "Taza", "DUT informatique");
	//affichage des attributs
	E2.EcrirePersonne();
	E.modifierPersonne("rue du grenadier", "Rabat");
	S.modifierPersonne("rue Taounat", "Safi");
	Personne.nbPersonnes();
	}
}
package Tp3_4;

public class Bibliotheque {
    public static void main(String[] args) {
        ListeDeDocuments listeDocs = new ListeDeDocuments();

        Livre1 Livre11 = new Livre1(1, "La boite a merveille", "Ahmed Sefrioui", 200);
        Livre1 Livre12 = new Livre1(2, "Les miserables", "Vector Hugo", 300);
        Dictionnaire dico1 = new Dictionnaire(3, "Le Robert Junior", "Français", 2);

        listeDocs.ajouterDocument(Livre11);
        listeDocs.ajouterDocument(Livre12);
        listeDocs.ajouterDocument(dico1);

        listeDocs.tousLesAuteurs();
        listeDocs.tousLesDocuments();
    }
}

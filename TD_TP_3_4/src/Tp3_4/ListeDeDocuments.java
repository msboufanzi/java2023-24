package Tp3_4;
import java.util.ArrayList;
import java.util.List;

public class ListeDeDocuments {
    private List<Document> listeDocuments;

    public ListeDeDocuments() {
        this.listeDocuments = new ArrayList<>();
    }

    public void ajouterDocument(Document doc) {
        listeDocuments.add(doc);
    }

    public void tousLesAuteurs() {
        for (Document doc : listeDocuments) {
            if (doc instanceof Livre1) {
                Livre1 Livre1 = (Livre1) doc;
                System.out.println("Numéro : " + Livre1.numeroEnregistrement + ", Auteur : " + Livre1.auteur);
            }
        }
    }

    public void tousLesDocuments() {
        for (Document doc : listeDocuments) {
            System.out.println(doc.toString());
        }
    }
}

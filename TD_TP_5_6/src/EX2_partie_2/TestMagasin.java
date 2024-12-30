package EX2_partie_2;

public class TestMagasin {
    public static void main(String[] args) {
        Magasin magasin = new Magasin(5, 5);

      
        ArticleElectromenager article1 = new ArticleElectromenager(100.0, 150.0, "Réfrigérateur", "Fournisseur A");
        ArticleElectromenager article2 = new ArticleElectromenager(50.0, 80.0, "Machine à laver", "Fournisseur B");

      
        ArticlePrimeur primeur1 = new ArticlePrimeur(1.5, 2.0, "Pommes", "Fournisseur C");
        ArticlePrimeur primeur2 = new ArticlePrimeur(2.0, 3.0, "Oranges", "Fournisseur D");

       
        article1.remplirStock(10);
        article2.remplirStock(8);
        primeur1.remplirStock(20.0);
        primeur2.remplirStock(15.0);

        double revenuTotal = 0.0;
        revenuTotal += magasin.vendreArticle(article1, article1.vendre(5));
        revenuTotal += magasin.vendreArticle(article2, article2.vendre(6));
        revenuTotal += magasin.vendreArticle(primeur1, primeur1.vendre(8));
        revenuTotal += magasin.vendreArticle(primeur2, primeur2.vendre(10));

        System.out.println(magasin.toString());

        System.out.println("Rendement du magasin: " + magasin.rendement() + "%");
    }
}

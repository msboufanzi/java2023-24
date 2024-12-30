package EX2_partie_2;

public class Magasin {
	private double depense;
    private double revenu;
    private ArticleElectromenager[] articlesElectromenagers;
    private ArticlePrimeur[] articlesPrimeurs;

    public Magasin(int capaciteArticlesElectromenagers, int capaciteArticlesPrimeurs) {
        this.depense = 0.0;
        this.revenu = 0.0;
        this.articlesElectromenagers = new ArticleElectromenager[capaciteArticlesElectromenagers];
        this.articlesPrimeurs = new ArticlePrimeur[capaciteArticlesPrimeurs];
    }
    public double rendement() {
        if (depense != 0) {
            return ((revenu - depense) / depense) * 100.0;
        } else {
            return 0.0;
        }
    }
    public void acheterArticle(Article article, double prix) {
        depense += prix;
    }

    public double vendreArticle(Article article, double prix) {
        return revenu += prix;
    }
    public String toString() {
        StringBuilder magasinInfo = new StringBuilder();
        magasinInfo.append("=== État du Magasin ===\n");
        magasinInfo.append("Dépense totale: ").append(depense).append("\n");
        magasinInfo.append("Revenu total: ").append(revenu).append("\n");
        magasinInfo.append("Taux de rendement: ").append(rendement()).append("%\n");
        return magasinInfo.toString();
    }
}

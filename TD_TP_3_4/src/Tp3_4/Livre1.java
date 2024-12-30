package Tp3_4;

public class Livre1 extends Document {
    protected String auteur;
    private int nombrePages;

    public Livre1(int numeroEnregistrement, String titre, String auteur, int nombrePages) {
        super(numeroEnregistrement, titre);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    @Override
    public String toString() {
        return "Livre1 [Numéro : " + numeroEnregistrement + ", Titre : " + titre +
                ", Auteur : " + auteur + ", Nombre de pages : " + nombrePages + "]";
    }
}

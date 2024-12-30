package Tp3_4;

public class Dictionnaire extends Document {
    private String langue;
    private int nombreTomes;

    public Dictionnaire(int numeroEnregistrement, String titre, String langue, int nombreTomes) {
        super(numeroEnregistrement, titre);
        this.langue = langue;
        this.nombreTomes = nombreTomes;
    }

    public String toString() {
        return "Dictionnaire [Numéro : " + numeroEnregistrement + ", Titre : " + titre +
                ", Langue : " + langue + ", Nombre de tomes : " + nombreTomes + "]";
    }
}

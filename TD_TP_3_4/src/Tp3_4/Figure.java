package Tp3_4;
import java.util.ArrayList;
import java.util.List;
public class Figure {
    private int abscice;
    private int ordonnee;
    private int color;
    private static List<Figure> vector = new ArrayList<>();

    public Figure(){}
    public Figure(int absice, int ordonne,int color){
        this.abscice=abscice;
        this.ordonnee=ordonne;
        this.color=color;
        vector.add(this);
    }
    public static List<Figure> getInstances(){
        return vector;
    }

}

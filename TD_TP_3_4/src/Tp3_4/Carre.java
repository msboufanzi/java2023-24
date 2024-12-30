package Tp3_4;
import java.util.ArrayList;
import java.util.List;
public class Carre extends Figure{
    private int coteLenght;
    public Carre(int absice, int ordonne,int color,int coteLenght){
        super(absice,ordonne,color);
        this.coteLenght=coteLenght;
    }

    public static List<Figure> getInstances(){
        List<Figure> carres= new ArrayList<>();
        for(Figure figure : Figure.getInstances()){
            if(figure instanceof  Carre){
                carres.add(figure);
            }
        }
        return carres;
    }
}

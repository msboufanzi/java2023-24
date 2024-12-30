package Tp3_4;
import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure{
    private int height ,width;

    //constructor par defaut
    public Rectangle(){}
    //constructor
    public Rectangle(int absice, int ordonne,int color,int height,int width){
        super(absice,ordonne,color);
        this.height=height;
        this.width=width;
    }
    public static List<Figure> getInstances() {
        List<Figure> rectangles = new ArrayList<>();
        for (Figure figure : Figure.getInstances()) {
            if (figure instanceof Rectangle) {
                rectangles.add(figure);
            }
        }
        return rectangles;
    }

}

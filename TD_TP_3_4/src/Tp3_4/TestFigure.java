package Tp3_4;
public class TestFigure {
    public static void main(String[] args) {
        Figure figure1 = new Figure(23, 1, 000);
        Carre carre = new Carre(0, 0, 000, 20);
        Rectangle rectangle = new Rectangle(30, 26, 111, 40, 5);

        System.out.println("Figure : " + Figure.getInstances());
        System.out.println("Toutes les Carre : " + Carre.getInstances());
        System.out.println("Toutes les Rectangle : " + Rectangle.getInstances());
    }
}

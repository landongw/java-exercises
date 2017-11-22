package exercises.shapes;

public class Main {

    public static void main(String[] args) {

        Circle myCircle = new Circle("circle name", "red",2.0);

        Shape mySquare = new Square("spongebob squarepants", "yellow", 4.3);

        System.out.println(myCircle.getRadius());
    }
}

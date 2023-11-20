package laboratorul6;

public class Main {
    public static void main(String[] args){
        Shape.afisareCeva();

        Triangle triangle1 = new Triangle(5);
        Square square1 = new Square(6);
        triangle1.desen();
        square1.desen();
    }
}

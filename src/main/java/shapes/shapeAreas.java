package shapes;

public class shapeAreas {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 5);
        Square square = new Square(9);
        Circle circle = new Circle(12);

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea()); 

    }

}

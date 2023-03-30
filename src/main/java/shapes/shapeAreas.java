package shapes;

public class shapeAreas {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 5);
        Square square = new Square(9);
        Circle circle = new Circle(12);
        Rectangle rectangle1 = new Rectangle(10.5, 4.5);

        rectangle1.setLength(-20.5);

        System.out.println("The area of the rectangle is " +rectangle1.calculateArea());

        System.out.println("Triangle area : " + triangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());

    }

}

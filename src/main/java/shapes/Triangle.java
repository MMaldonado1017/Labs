package shapes;

public class Triangle {
    public double triangleBase;
    public double triangleHeight;

    public Triangle(double base, double height) {
        this.triangleBase = base;
        this.triangleHeight = height;
    }

    public double calculateArea() {
        return triangleBase * triangleHeight/2;
    }
}

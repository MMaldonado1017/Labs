package shapes;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        if (length < 0) {
            System.out.println("we cannot set a negative length");

        }else {
            this.length = length;
        }
    }

    public double getLength(){
        return this.length;
    }
    public double calculateArea(){
        return this.length * this.width;
    }


}

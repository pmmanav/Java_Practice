package abstraction.shapes;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        // TODO Auto-generated method stub
        return length * width;
    }

}

package abstraction.shapes;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.calculateArea());
    }
}

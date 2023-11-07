package abstraction.shapes;

/**
 * Shape
 */
public abstract class Shape {

    abstract double calculateArea();

    public void prints() {
        System.out.println("I am a shape");
    }
}
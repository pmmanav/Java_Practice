package objects;

public class Rectangle {
    // Adding private for encapsulation
    // we are hiding the fields and exposing the methods
    // protected access modifier => only classes in same package can access this.
    private double length;
    private double width;
    public Rectangle(){
        /*
         * This is the default constructor. In java even if we do not define this constructor. 
         * It is implicitly defined by java with empty {} block.
         */
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length*width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    
}

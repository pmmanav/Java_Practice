package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();
        double perimeterOfRoom1 = room1.calculatePerimeter();

        Rectangle room2 = new Rectangle(75, 30);
        double areaOfRoom2 = room2.calculateArea();
        
    }
}

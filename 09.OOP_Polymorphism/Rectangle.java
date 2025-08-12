 // Rectangle.java
public class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

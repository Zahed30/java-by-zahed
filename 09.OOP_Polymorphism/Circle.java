// Circle.java
public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

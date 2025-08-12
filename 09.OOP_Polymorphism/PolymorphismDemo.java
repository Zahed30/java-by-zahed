// PolymorphismDemo.java
public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area(); // Runtime: Circle's method
        s2.area(); // Runtime: Rectangle's method
    }
}

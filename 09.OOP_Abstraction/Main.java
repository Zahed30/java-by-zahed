public class Main {
    public static void main(String[] args) {
        // Shape reference, but object of Circle
        Shape shape1 = new Circle();
        shape1.draw();  // Runtime decision → Polymorphism
        shape1.info();

        // Shape reference, but object of Rectangle
        Shape shape2 = new Rectangle();
        shape2.draw();
        shape2.info();
    }
}
/*Shape is abstract → You cannot create Shape object directly.

Circle & Rectangle provide their own implementation of draw().

Using Shape reference → Runtime polymorphism (decides which draw() to call at runtime). */

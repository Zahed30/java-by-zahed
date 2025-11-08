public class ExceptionHandlingDemo {

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Program started...");

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("⚠️ Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("✅ Finally block executed (cleanup code)");
        }

        System.out.println("Program ended normally!");
    }
}

public class WrapperClassDemo {

    public static void main(String[] args) {
        // Primitive types
        int num = 10;
        char letter = 'A';
        double price = 99.99;

        // 1️ Manual Boxing (primitive → object)
        Integer boxedNum = Integer.valueOf(num);
        Character boxedChar = Character.valueOf(letter);
        Double boxedPrice = Double.valueOf(price);

        System.out.println("Boxed Integer: " + boxedNum);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Boxed Double: " + boxedPrice);

        // 2️ Manual Unboxing (object → primitive)
        int unboxedNum = boxedNum.intValue();
        double unboxedPrice = boxedPrice.doubleValue();
        System.out.println("Unboxed Integer: " + unboxedNum);
        System.out.println("Unboxed Double: " + unboxedPrice);

        // 3️ Auto-boxing and Auto-unboxing (automatic by compiler)
        Integer autoBox = num;        // int → Integer (autoboxing)
        int autoUnbox = autoBox;      // Integer → int (auto-unboxing)
        System.out.println("Auto-boxed Integer: " + autoBox);
        System.out.println("Auto-unboxed Integer: " + autoUnbox);

        // 4️  Useful Wrapper Class Methods
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Double.parseDouble(\"45.6\"): " + Double.parseDouble("45.6"));
    }
}

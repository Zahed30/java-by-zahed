public class CheckEven {
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 4;
        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

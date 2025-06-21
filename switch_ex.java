 import java.util.Scanner;

public class switch_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate remainder
        int remainder = Math.abs(number % 2); // ensure non-negative for switch

        // Check even or odd using switch
        switch (remainder) {
            case 0:
                System.out.println(number + " is Even.");
                break;
            case 1:
                System.out.println(number + " is Odd.");
                break;
            default:
                System.out.println("Unexpected error.");
        }

        sc.close();
    }
}

// In this program its check whether you are eligble for test with age and marks
import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
         

        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        // Logical AND (&&)
        if (age >= 18 && marks >= 60) {
            System.out.println("You are eligible for the test.");
        } else {
            System.out.println("You are NOT eligible for the test.");
        }

        // Logical OR (||)
        if (age >= 18 || marks >= 60) {
            System.out.println("You meet at least one requirement.");
        } else {
            System.out.println("You do not meet any requirement.");
        }

        // Logical NOT (!)
        boolean isStudent = true;
        if (!isStudent) {
            System.out.println("You are not a student.");
        } else {
            System.out.println("You are a student.");
        }

        scanner.close();
    }
}

 


import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;
        System.out.print("Enter no. of foods you want??: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for (int i = 0;i <foods.length; i++) {
            System.out.print("Enter a food : ");
            foods[i] = scanner.nextLine();
        }
        for (String food : foods) {
            System.out.println(food);

        }
        scanner.close();

    }

}

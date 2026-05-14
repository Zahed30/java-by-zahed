import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = new int[5]; 

        System.out.print("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();  // user input
        }
        

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array: " + sum);

    }

}

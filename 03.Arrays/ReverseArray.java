import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            
        }
        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];  

        System.out.print("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();  
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {// change the symbol to find max value (arr[i]>max)
                min = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);

    }
}

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=scanner.nextInt();
        if ( a<=0) {
            System.out.println(a+" "+"it is an negative number");
        }else{
            System.out.println(a+" "+"it is an positive number");
        }
        scanner.close();
    }
    
}

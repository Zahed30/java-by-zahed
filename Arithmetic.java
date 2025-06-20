import java.util.Scanner;
public class Arithmetic {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.println("The additon of two number :" + (a + b));
        System.out.println("The substraction of two number :" + (a - b));
        System.out.println("The multiplication of two number :" + (a * b));
        System.out.println("The division of two number :" + (a / b));
        System.out.println("The modulus of two number :" + (a % b));
        
    }
    
}
    


import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        //example 1
        int i=10;
        do{
        System.out.println("number:"+i);
        i++;
        }while(i<=5);//If the condition is false the Loop run once
        
        
        //example 2
        //sum number of 1 to 100
        int sum =0,i=1;
        do{
            sum +=i;
            i++;
        }while(i<=100);
        System.out.println("sum ="+sum);

    Example 3
    A program that asks for a password, and it should ask at least once, and repeat if the password is wrong:
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
            if (!password.equals("java123")) {
                System.out.println("wrong password");
                
            }
        } while (!password.equals("java123"));

        System.out.println("Access granted!");
    }
}

      

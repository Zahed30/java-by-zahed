import java.util.Scanner;

public class while_ex { 
          public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // EXAMPLE 1
        //it will work until you input your name!
        
        String name = "";
        
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // EXAMPLE 2
        //your playing the imaginary game and press to quit it
        
        String response = "";
        
        while(!response.equals("Q")){
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit");


    }
    
}

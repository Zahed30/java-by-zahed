import java.util.Scanner;

public class userI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name :");
        String name=scanner.nextLine();
        System.out.print("Enter your age :");
        String age=scanner.nextInt();
        System.out.println("What is your gpa: ");
        double gpa = scanner.nextDouble();

       System.out.println("Are you a student? (true/false): ");
       boolean isStudent = scanner.nextBoolean();

       System.out.println("Hello " + name);
       System.out.println("You are " + age + " years old");
       System.out.println("Your gpa is: " + gpa);

       if(isStudent){
           System.out.println("You are enrolled in classes");
       }
       else{
           System.out.println("You are NOT enrolled in classes");
      }

        scanner.close();
    }
    
}

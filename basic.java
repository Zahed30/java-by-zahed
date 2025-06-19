public class basic {
    public static void main(String[] args) {
        int age=19;
        int year=2025;

        //double
        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        //char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        //boolean 
        boolean isstudent=true;
        boolean forSale = false;
        boolean isOnline = true;

        //string
        
        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("your age is :"+age);
                System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }

    }
    
}

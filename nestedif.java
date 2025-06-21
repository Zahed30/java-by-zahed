//this program states as to give give discount for movie ticket :)
public class nestedif {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 250.50;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
 

public class do_while {
    public static void main(String[] args) {
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
    }

}

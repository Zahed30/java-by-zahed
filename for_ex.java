import java.util.Scanner;

public class for_ex {
    public static void main(String[] args)throws InterruptedException  {
        // example 1
        for(int i=10;i>0;i-=2){  // for(int i=10;i<=1;i--) //for(int i=1;i<=10;i+=2) //(int i=10;i>0;i-=2)
            System.out.println(i);
        }
        //example 2
        //countdown 
        Scanner Scanner=new Scanner(System.in);
        System.out.print("How many seconds to countdown from?: ");
        int start= Scanner.nextInt();
        for(int i=start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.print("HAPPY NEW YEAR!");
         Scanner.close();
    }

}

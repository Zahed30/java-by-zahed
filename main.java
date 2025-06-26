import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        int num;
        System.out.println("enter the number for multiplication :");
        num=Scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num +"x" + i + "="+(num*i));
        }
    }
}
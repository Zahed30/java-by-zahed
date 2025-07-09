import java.util.Scanner;
public class nested_loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows;
        int columns;
        char symbol;
        System.out.print("enter number of rows :");
        rows =scanner.nextInt();
        System.out.print("enter number of columns :");
        columns =scanner.nextInt();
        System.out.print( "enter a symbol :");
        symbol =scanner.next().charAt(0);

         for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(symbol);

            }
            System.out.println();
         }
         scanner.close();
    }
}


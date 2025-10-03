public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n * 2; i++) {
            int totalcolrows = i > n ? 2 * n - i : i;
            int spaces=n-totalcolrows;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= totalcolrows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
/* output 
    * 
   * * 
  * * *
 * * * *
* * * * *
 * * * *
  * * * 
   * *
    *
 */

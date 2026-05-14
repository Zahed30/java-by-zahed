public class pattern9 {
    public static void main(String[] args) {
        int n=4;
        n=2*n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int ateveryindex=Math.min(Math.min(i, j),Math.min(n-i, n-j));
                System.out.print(ateveryindex +" ");
                
            }
            System.out.println();
            
        }
    }
}
/*
0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0
 */
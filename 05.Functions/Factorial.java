public class Factorial {
    static int Factorial(int n){
        int fact =1;
        for(int i=1;i<n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int result=Factorial(5);
        System.out.println("factorail = "+result);
        
    }
    
}

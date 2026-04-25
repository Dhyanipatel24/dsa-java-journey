import java.util.*;
public class factorial_funstion {
    public static int calculateFactorial(int n){
        int fact=1;
        for(int i =1;i<=n;i++){
            
            fact=fact*i;

        }
        return fact;
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int fact=calculateFactorial(n);
        System.out.println(fact);
    }
}

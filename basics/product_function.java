import java.util.*;
public class product_function {
    public static int calculateProduct(int num1,int num2){
        int product=num1*num2;
        return product;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a : ");
            int a = sc.nextInt();
            System.out.println("Enter b : ");
            int b = sc.nextInt();
           int product= calculateProduct(a,b);
            System.out.println(product);
        }
    }
    


import java.util.*;
public class sumofevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int even=0;
        int odd=0;
        do{
            System.out.println("Enter no");
            n = sc.nextInt();
            if(n%2==0){
            even=even+n;
           
        }
        else{
            odd=odd+n;
        }
        System.out.println("continue? press 1 for yes 2 for no");
        choice=sc.nextInt();
        }while(choice==1);
        System.out.println(even);
        System.out.println(odd);
        
    }
    
}

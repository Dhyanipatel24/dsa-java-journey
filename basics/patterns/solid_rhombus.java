public class solid_rhombus{
public static void solid_rhombus(int n){
        for(int i =4;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*****");
            System.out.println();
        }
    }
}
public static void main(String args[]){
        solid_rhombus(5)
}

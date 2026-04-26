public class bin_to_dec {
    public static void bin_to_deci(int bin){
        int myNum=bin;
        int dec=0;
        int pow=0;
        while(bin>0){
            int lastdigit=bin%10;
            dec=dec+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            bin=bin/10;
        }
        System.out.println("decimal of " + myNum + " = " +dec);

    }
    public static void main(String[] args) {
        bin_to_deci(101);
    }
}

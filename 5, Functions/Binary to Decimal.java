import java.util.*;
public class Binary_to_Decimal_conversion {
    // function to convert binary to decimal
    public static int BinToDec(int n){
        int dec_num = 0;
        int power = 0;
        
        while(n>0){
            int last_digit = n % 10;
            dec_num = dec_num + last_digit*(int)(Math.pow(2,power));
            power++;
            n = n / 10;
        }
        return dec_num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Binary Number : ");
        int n = sc.nextInt();
        System.out.println(BinToDec(n));
    }
}

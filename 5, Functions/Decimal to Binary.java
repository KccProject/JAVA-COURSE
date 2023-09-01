import java.util.*;

public class Decimal_to_Binary_conversion {
    public static void DecToBin(int n){
        int pow = 0;
        int Bin_num =0;
        while(n>0){
            int rem = n % 2;
            Bin_num = Bin_num + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println(Bin_num);
    }
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        DecToBin(num);
    }
}

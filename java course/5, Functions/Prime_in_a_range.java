import java.util.*;
public class Prime_in_a_range {
    public static boolean isprime(int number){
        boolean prime = true;
        for(int i=2;i<((number)^(1/2));i++) if(number%i==0) return false;
        return prime;
    }

    public static void prime(int n){
        for(int i=2;i<=n;i++){
            boolean check = isprime(i);
            if(check == true) System.out.print(i+",");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
}

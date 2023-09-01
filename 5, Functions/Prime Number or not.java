import java.util.*;
public class Prime_number {
    // function for checking the number is prime or not
    // Traditional method
    // public static boolean isprime(int number){
    //     boolean prime = true;
    //     for(int i=2;i<number;i++) if(number%i==0) return false;
    //     return prime;
    // }
    // ptimised version of checking the number is prime or not
    public static boolean isprime(int number){
        boolean prime = true;
        for(int i=2;i<((number)^(1/2));i++) if(number%i==0) return false;
        return prime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Your number : "+number+" is prime? = "+isprime(number));
    }
}

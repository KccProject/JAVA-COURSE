import java.util.*;

public class Binomial_coefficient {
    public static int factorial_of_a_number(int num){
        int factorial=1;
        for(int i=1;i<=num;i++) factorial = factorial * i;
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int coeficient = (factorial_of_a_number(n))/(factorial_of_a_number(r)*factorial_of_a_number(n-r));
        System.out.println("The Binomial Coefficient of ("+n+","+r+") is : "+coeficient);
    }
}

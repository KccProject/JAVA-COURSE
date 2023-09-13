import java.util.*;

public class factorial_of_a_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int factorial_of_a_number=1;
        for(int i=1;i<=number;i++) factorial_of_a_number = factorial_of_a_number * i;
        System.out.println("The Factorial of a "+number+" is : "+factorial_of_a_number);
    }
}

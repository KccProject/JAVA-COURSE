import java.util.*;

public class factorial_using_function {
    public static int factorial_of_a_number(int n){
        int factorial=1;
        for(int i=1;i<=n;i++) factorial = factorial * i;
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The factorial of a "+num+" is : "+factorial_of_a_number(num));
    }
}

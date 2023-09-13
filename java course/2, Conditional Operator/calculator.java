import java.util.*;

public class calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        float num1 = scan.nextFloat();
        System.out.println("Enter your second number : ");
        float num2 = scan.nextFloat();
        System.out.println("Enter your operator : ");
        char operator = scan.next().charAt(0);

        switch(operator){
            case '+': System.out.println(num1+num2); break;
            case '-': System.out.println(num1-num2); break;
            case '*': System.out.println(num1*num2); break;
            case '/': System.out.println(num1/num2); break;
            case '%': System.out.println(num1%num2); break;
            default: System.out.println("Invalid");
        }
    }
}
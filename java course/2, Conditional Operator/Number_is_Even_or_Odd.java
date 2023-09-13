import java.util.*;

public class Number_is_Even_or_Odd {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        if(num1%2==0) System.out.print("Your number is Even");
        else System.out.print("Your number is Odd");
    }
}

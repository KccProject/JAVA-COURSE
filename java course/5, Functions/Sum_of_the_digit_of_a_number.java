import java.util.*;
public class Sum_of_the_digit_of_a_number {
    public static int SumOfDigit(int n){
        int sum_of_digit = 0;
        while(n>0){
            sum_of_digit = sum_of_digit + n%10;
            n = n/10;
        }
        return sum_of_digit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The Sum of Digit's of a number is : "+SumOfDigit(number));
    }
}

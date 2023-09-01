import java.util.*;
public class Palindrome_or_not {
    public static boolean check_palindrome(int n){
        int original_num = n;
        int reverse_num = 0;
        while(n>0){
            reverse_num = reverse_num*10 + n%10;
            n=n/10;
        }
        //System.out.println(reverse_num);
        if(original_num==reverse_num) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(check_palindrome(number));
    }
}

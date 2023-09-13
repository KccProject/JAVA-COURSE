import java.util.*;
public class Palindromic_Number_pattern {
    public static void palindrome(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            // spaces
            for(int j=n;j>i;j--) System.out.print(" ");
            // number
            for(int j=i;j>1;j--) System.out.print(j);
            for(int j=1;j<=i;j++) System.out.print(j);
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindrome(n);
    }
}

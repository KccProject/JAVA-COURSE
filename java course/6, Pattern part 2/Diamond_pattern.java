import java.util.*;
public class Diamond_pattern {
    public static void daimond(int n){
        // Upper HALF
        // Outer Loop
        for(int i=1;i<=n;i++){
            // Inner Loop
            //spaces
            for(int j=n;j>i;j--) System.out.print(" ");
            //stars
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
        // Lower Half
        // Only Outer Loop reverse hoga
        for(int i=n;i>=1;i--){
            // Inner Loop
            //spaces
            for(int j=n;j>i;j--) System.out.print(" ");
            //stars
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        daimond(n);
    }
}
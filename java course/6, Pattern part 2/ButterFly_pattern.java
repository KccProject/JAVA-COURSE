import java.util.*;
public class ButterFly_pattern {

    public static void ButterFly(int n){
        // Upper Half
        for(int i=1;i<=n;i++){
            // stars -> i
            for(int j=1;j<=i;j++) System.out.print("*");
            // spaces -> 2*(n-1)
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            //stars -> i
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        //Lower half
        // isme outer loop reverse ho jayga
        // baki inner loop same rahega
        int count = 0;
        for(int i=n;i>=1;i--){
            // stars -> i
            for(int j=1;j<=i;j++) System.out.print("*");
            // spaces -> 2*(n-1)
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            //stars -> i
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        ButterFly(row);
    }
}

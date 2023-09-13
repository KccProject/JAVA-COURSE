import java.util.*;
public class solid_rhombus {
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            // space
            for(int j=n;j>i;j--) System.out.print(" ");
            //stars
            for(int j=1;j<=n;j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        rhombus(row);
    }
}

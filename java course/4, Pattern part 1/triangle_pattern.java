import java.util.*;

public class triangle_pattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

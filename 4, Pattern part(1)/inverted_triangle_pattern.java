import java.util.*;

public class inverted_triangle_pattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for(int i=0;i<row;i++){
            for(int j=row;j>i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

import java.util.*;
public class Zero_One_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
 
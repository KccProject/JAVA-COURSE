import java.util.*;

public class Hollow_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();

        // Logic for Printing Hollow Rectangle
        for(int i=0;i<length;i++){
            for(int j=0;j<breath;j++){
                if((i==0||i==length-1)||(j==0||j==breath-1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
        
    }
}

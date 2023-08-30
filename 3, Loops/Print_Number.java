import java.util.*;

public class Print_Number{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 1;
        while(number>=count){
            System.out.print(count+" ");
            count++;
        }
    }
}
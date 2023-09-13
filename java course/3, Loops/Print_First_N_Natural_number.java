import java.util.*;

public class Print_First_N_Natural_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int counter = number;
        int sum=0;
        while(counter>0){
            sum = sum + counter;
            counter--;
        }
        System.out.println("Sum of first "+number+" number is : "+sum);
    }
}

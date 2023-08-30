import java.util.*;

public class reverse_of_a_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int original_number = scan.nextInt();
        int reverse_number = 0;
        while(original_number>0){
            int last_number = original_number%10;
            reverse_number = reverse_number *10 + last_number;
            original_number = original_number / 10;
        }
        System.out.println("Reversed number is "+reverse_number);   
    }
}

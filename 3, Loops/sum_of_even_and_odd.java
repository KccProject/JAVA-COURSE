import java.util.*;

public class sum_of_even_and_odd {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int even_sum=0,odd_sum=0;
        for(int i=0;i<num;i++){
            int n = scan.nextInt();
            if(n%2==0) even_sum=even_sum+n;
            else odd_sum=odd_sum+n;
        }
        System.out.println("The sum of even numbers is : "+even_sum);
        System.out.println("The sum of odd numbers is : "+odd_sum);
    }
}

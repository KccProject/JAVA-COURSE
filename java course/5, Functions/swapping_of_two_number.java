import java.util.*;

public class swapping_of_two_number {
    // call by value
    public static void swap_by_value(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping with call by value approach");
        swap_by_value(a,b);// call by value
        System.out.println("The value of a : "+a+" and b : "+b);
    }
}

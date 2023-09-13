import java.util.*;

public class Largest_of_two_numbers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        if(first>second) System.out.print("First number is greatest/Largest");
        else System.out.print("Second number is greatest/Largest");
    }
}

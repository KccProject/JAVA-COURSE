import java.util.*;
public class find_leap_year {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if((year%4)==0){
            if((year%100)==0){
                if((year%400)==0){
                    System.out.println(year+" is a Leap Year");
                }
                else System.out.println(year+" is not a Leap Year");
            }
            else System.out.println(year+" is a Leap Year");
        }
        else System.out.println(year+" is not a Leap Year");
    }
}

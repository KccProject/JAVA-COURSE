import java.util.*;

public class Largest_of_Three_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        float first = scan.nextFloat();
        float second = scan.nextFloat();
        float third = scan.nextFloat();
        //if(first==second & first==third) System.out.print("ALL these are Equal");
        if(first>second){
            if(first>third) System.out.println(first+" is the Largest");
            else System.out.println(third+" is the Largest");
        }
        else{
            if(first>third) System.out.println(second+" is the Largest");
            else if(second>third) System.out.println(second+" is the Largest");
            else System.out.println(third+" is the Largest");
        }
    }
}

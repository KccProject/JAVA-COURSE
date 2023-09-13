import java.util.*;

public class Example_of_Break_statement {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            num = scan.nextInt();
            if((num%10)==0) break;
            System.out.println(num);
        }
        while(true);
    } 
}

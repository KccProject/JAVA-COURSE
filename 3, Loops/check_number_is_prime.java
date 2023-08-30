import java.util.*;

public class check_number_is_prime{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean check = true;
        for(int i=3;i<number;i++){
            if((number%i)==0){
                check = false;
                break;
            }
        }
        if(check==true) System.out.println(number+" is a prime number");
        else System.out.println(number+" is not a prime number");
    }
}
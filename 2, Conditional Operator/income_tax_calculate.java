import java.util.*;

public class income_tax_calculate {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long income = scan.nextInt();
        System.out.print("Your calculated income tax is : ");
        if(income<=250000) System.out.print("Zero");
        else if(income>250000 & income<=500000) System.out.println((income*5)/100);
        else if(income>500000 & income<=1000000) System.out.println((income*20)/100);
        else System.out.println((income*30)/100);
    }
}

import java.util.*;

public class Example_of_Continue{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // for(int i=1;i<num;i++){
        //     if(i>3) continue;
        //     System.out.println(i);
        // }
        do{
            int num = scan.nextInt();
            if((num%10)==0) continue;
            System.out.println(num);
        }while(true);    
    }
}
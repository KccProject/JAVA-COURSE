import java.util.*;

public class Pass_Faill {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        float marks = scan.nextFloat();
        // Normal method
        //if(marks>=33) System.out.println("You are PASS!");
        //else System.out.println("You are FAIL!");

        // Using Ternary Operator Method
        String result = (marks>=33)?"PASS":"Fail";
        System.out.println(result);
    }
}

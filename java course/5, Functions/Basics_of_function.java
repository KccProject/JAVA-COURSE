import java.util.*;

public class Basics_of_function {
    // We have to define our function int this class Always
    // We can make unlimited functions in this class
    // in java these functions have also another name is method

    //Rest of the logic or the concept is like c++ that you have learned in your previous classes

    public static void printHW(){
        System.out.println("HELLO!! WORLD");
        System.out.println("HELLO!! WORLD");
        System.out.println("HELLO!! WORLD");
    }

    public static void sum(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("Th sum of "+a+" and "+b+" is : "+sum);
    }

    // public static void calculatesum(int a,int b){
    //     int sum = a + b;
    //     System.out.println("The Calculated Sum of "+a+" and "+b+" is : "+sum);
    // }

    public static int calculatesum(int a,int b){// jo variable m inke () beech m likhta hu unhe ham formal parameter kehte h
        int sum = a + b;
        //System.out.println("The Calculated Sum of "+a+" and "+b+" is : "+sum);
        return sum;
    }

    public static void main(String args[]){
        printHW();
        // without passing parameter
        sum();
        // with passing parameter
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The Calculated Sum of "+a+" and "+b+" is : "+calculatesum(a,b));
        // jo value m pass krta hu functions m to usse ham "Argument" kehte h
        // Arguments or actual parameters
    }
}
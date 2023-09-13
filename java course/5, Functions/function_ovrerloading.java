import java.util.*;

// Now we gonna be learn about Function Overloading
// We can make different versions of the functions which have same Name
// The only difference between them is 'PARAMETERS' and 'DATATYPES'
// if two functions have same name and have different parameters, then they work differently
// it only based upon which type of parameters, User wants to give input
// on the basis of input given by the user

public class function_ovrerloading {

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c1 = sc.nextInt();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
        System.out.println(sum(a,b,c1));
    }
}

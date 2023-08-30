import java.util.*;

public class input_in_java {
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // for single word input you have to use 'next()'
        System.out.println(input);
       
       
        String name = sc.nextLine();
        // for multi word input you have to use 'nextLine()'
        System.out.println(name);

        // for taking input as a int
        // we always use nextInt()
        int num = sc.nextInt();
        System.out.println(num);

        // for a taking input as a byte
        // we have to use 'nextByte()'
        byte b = sc.nextByte();
        System.out.println(b);

        // for taking input as a float
        // we always use nextFloat()
        Float flo = sc.nextFloat();
        System.out.println(flo);

        // for taking input as a Double
        // we always use nextDouble()
        double doub = sc.nextDouble();
        System.out.println(doub);

        // for taking input as a Boolean
        // we always use nextBoolean()
        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        // for taking input as a long
        // we always use nextLong()
        long loo = sc.nextLong();
        System.out.println(loo);
    }
}

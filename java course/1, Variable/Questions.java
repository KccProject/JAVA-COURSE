import java.util.*;
public class Questions {
    public static void main(String args[]) {
        // Average
        Scanner scan = new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        System.out.print("The average of A , B & C is : ");
        System.out.println((A+B+C)/3);

        // Area of Square
        float side = scan.nextFloat();
        System.out.print("The Area of a Square is : ");
        System.out.println(side*side);

        // Costing of the Shopping
        float pencil = scan.nextFloat();
        float pen = scan.nextFloat();
        float eraser = scan.nextFloat();
        float total = pencil + pen + eraser;
        float gst = (total*18)/100;
        System.out.print("The Costing of shopping is : ");
        System.out.println(total+gst);
    }
}

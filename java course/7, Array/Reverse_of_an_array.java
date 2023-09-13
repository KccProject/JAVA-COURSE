import java.util.*;
public class Reverse_of_an_array {
    public static void reverse(int arr[]){
        int end = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW many numbers you want in an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        reverse(arr);
        for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
    }
}

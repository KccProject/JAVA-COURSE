import java.util.*;
public class All_Subarray {
    public static void printSubArray(int arr[]){
        int start,end,total_subarray=0;
        for(int i=0;i<arr.length;i++){
            start = i;
            for(int j=i;j<arr.length;j++){
                end = j;
                for(int k = start;k<=end;k++) System.out.print(arr[k]+" ");
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total SubArray is "+total_subarray);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        printSubArray(arr);
    }
}

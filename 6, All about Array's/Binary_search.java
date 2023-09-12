import java.util.*;

public class Binary_search {
    public static boolean binarySearch(int arr[],int key){
        int mid = arr.length/2;
        int start = 0,end = arr.length-1;
        while(start<=end){
            if(arr[mid]==key) return true;
            if(arr[mid]>key) end = mid-1;
            else start = mid+1;
            mid = (start+end)/2;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int number[] = {2,4,6,8,10,12,14,16,18};
        //System.out.println(binarySearch(number, key));
        boolean found = binarySearch(number, key);
        if(found==true) System.out.println("Your number is found in an array");
        else System.out.println("Your number is not found in an array");
    }
}

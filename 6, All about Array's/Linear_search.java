import java.util.*;

public class Linear_search {
    public static boolean linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++) if(arr[i]==key) return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int key = sc.nextInt();
        int arr[] = {2,4,6,8,10,12,14,16};
        System.out.println(linearSearch(arr, key));
    }
}

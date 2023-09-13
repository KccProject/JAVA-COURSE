import java.util.*;

public class Max_SubArray_sum {

    // BY BRUTE FORCE APPROACH TO FIND MAXIMUM SUM ARRAY
    // WE have O(n^3) time complexity
    // public static void Max_Sum_of_SubArray(int arr[]){
    //     int sum=0;
    //     int max_sum = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             for(int k=i;k<=j;k++){
    //                 sum = sum + arr[k];
    //             }System.out.println(sum);
    //             if(max_sum<sum) max_sum = sum;
    //             sum=0;
    //         }
    //     }
    //     System.out.println(max_sum);
    // }

    // BY PREFIX SUM METHOD
    // WE have O(n^2) time complexity
    // public static void MAX_SUM_PREFIX(int arr[]){
    //     // first we make a prefix array of same size of array that is given to us
    //     int prefix[] = new int[arr.length];
    //     prefix[0] = arr[0];
    //     for(int i=1;i<arr.length;i++) prefix[i] = prefix[i-1] + arr[i];
    //     // find the maximum sum of subarray
    //     int current_sum = 0,max_sum = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             current_sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
    //             if(max_sum<current_sum) max_sum = current_sum;
    //         }
    //     }
    //     System.out.println(max_sum);
    // }

    // BY KADEN's METHOD
    public static void KadensMethod(int arr[]){
        int current_sum=0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            current_sum = current_sum + arr[i];
            //System.out.println(current_sum);
            if(current_sum>=0){
                if(current_sum>max_sum) max_sum=current_sum;
            }
            else current_sum=0;
        }
        System.out.println(max_sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        // BY BRUTE FORCE APPROACH
        // Max_Sum_of_SubArray(arr);

        // BY PREFIX METHOD
        // MAX_SUM_PREFIX(arr);

        //BY Kaden's Approach
        KadensMethod(arr);
    }
}

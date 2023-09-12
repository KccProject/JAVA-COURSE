//import java.util.*;
public class RainWater_Trapped_within_Blocks {
    // this is the function for calculating the trapped water
    // in this function we created a two auxilary array's
    // to find the water level on each block.
    public static int solution(int arr[]){
        int size = arr.length;
        // calculate left most boundry
        int leftmax[] = new int[size];
        leftmax[0] = arr[0];
        for(int i=1;i<size;i++) leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        // for(int i=0;i<size;i++) System.out.print(leftmax[i]+" ");
        // calculate right most boundry
        int rightmax[] = new int[size];
        rightmax[size-1] = arr[size-1];
        for(int i=size-2;i>=0;i--) rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        // for(int i=0;i<size;i++) System.out.print(rightmax[i]+" ");
        int water_level;
        int trapped_water=0;
        // Loop
        for(int i=0;i<size;i++){
            // water level = min(leftmax boundry,rightmax boundry)
            water_level = Math.min(leftmax[i],rightmax[i]);
            // trapped water = water level - arrr[i]
            trapped_water = trapped_water + water_level - arr[i];
        }
        return trapped_water;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(solution(height));
    }
}
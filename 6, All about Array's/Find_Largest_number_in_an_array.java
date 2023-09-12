public class Find_Largest_number_in_an_array {
    public static int largestNum(int arr[]){
        int large_num = arr[0];
        for(int i=1;i<arr.length;i++) if(large_num<arr[i]) large_num = arr[i];
        return large_num;
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        System.out.println(largestNum(arr));
    }
}

public class passing_arrary_to_a_function {
    // Whenever we pass an array to a function
    // so it passes as a "call by reference"
    public static void sum(int marks[]){
        int s = 1;
        for(int i=0;i<marks.length;i++) marks[i]=s;
    }
    public static void main(String args[]){
        // create an array
        int marks[]= new int[5];
        sum(marks);
        for(int i=0;i<marks.length;i++) System.out.print(marks[i]+" ");
    }
}

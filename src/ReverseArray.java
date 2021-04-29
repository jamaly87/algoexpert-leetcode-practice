import java.util.Arrays;

public class ReverseArray {
    public static int [] reverseArray (int [] array){
        int start=0;
        int end = array.length-1;
        int temp;
        while (start<end){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end --;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,56,77};
        int [] reversed = reverseArray(array);
        System.out.println(Arrays.toString(reversed));
    }
}

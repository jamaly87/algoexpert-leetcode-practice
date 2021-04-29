import java.util.Arrays;

public class RotateLeftArray {
    public static int [] rotateLeft (int [] array, int d){
        for (int i=0; i<d ; i++){
            rotateOnce(array);
        }
        return array;
    }

    public static void rotateOnce (int [] array){
        int firstElement = array[0];
        for (int i=0; i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=firstElement;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] rotated = rotateLeft(a,2);
        System.out.println(Arrays.toString(rotated));
    }
}

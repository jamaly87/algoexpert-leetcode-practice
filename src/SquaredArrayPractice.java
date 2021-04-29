import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SquaredArrayPractice {
    public static void main(String[] args) {
        int [] array = {-2,1,3,4,5,6};
        int [] newArray = new int [array.length];
        int smallerIdx = 0;
        int largeIdx = array.length-1;
        for (int i=0; i<array.length;i++){
            int smallerValue= array[smallerIdx];
            int largerValue=array[largeIdx];
            if (Math.abs(smallerValue)>Math.abs(largerValue)){
                newArray[i]=smallerValue*smallerValue;
                smallerIdx++;
            } else {
                newArray[i]=largerValue*largerValue;
                largeIdx--;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}

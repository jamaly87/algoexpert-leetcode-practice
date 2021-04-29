import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        //Sort the array so we know the order of the numbers
        Arrays.sort(array);
        List<Integer[]> tripletList = new ArrayList<>();
        for (int i=0; i<array.length-2;i++){
            int leftPointer= i+1;
            int rightPointer = array.length-1;
            while (leftPointer < rightPointer){
                int sum = array[i]+array[leftPointer]+array[rightPointer];
                if (sum<targetSum){
                    leftPointer++;
                }
                else if (sum>targetSum){
                    rightPointer--;
                }
                else if (sum==targetSum){
                    Integer [] newTriplet = new Integer[]{array[i],array[leftPointer],array[rightPointer]};
                    tripletList.add(newTriplet);
                    leftPointer++;
                    rightPointer--;
                }
            }
        }
        return tripletList;
    }
    public static void main(String[] args) {
        int targetSum = 0;
        int [] array = {12,3,1,2,-6,5,-8,6};
        System.out.println(threeNumberSum(array,targetSum));

    }
}

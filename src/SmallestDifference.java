import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idx1 = 0;
        int idx2 = 0;
        int smallest = Integer.MAX_VALUE; //set two values to infinity or max value to compare
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        //the loop will break when one of the arrays will finish looping.
        //because if one loop ends there is no point of checking the other numbers because the difference will only increase
        while (idx1 < arrayOne.length && idx2 < arrayTwo.length) {
            int firstNum = arrayOne[idx1];
            int secondNum = arrayTwo[idx2];
            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                idx1++;
            } else if (firstNum > secondNum) {
                current = firstNum - secondNum;
                idx2++;
            } else {
                return new int[]{firstNum, secondNum};
            }
            /*
            in the first check smallest will always be bigger than current
             */
            if (smallest > current) {
                smallest = current;
                smallestPair = new int[]{firstNum,secondNum};

            }
        }
        return smallestPair;
    }

    public static void main(String[] args) {
        int [] arr1 = {-1, 5, 10, 20, 28, 3};
        int [] arr2 = {26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(smallestDifference(arr1,arr2)));

    }
}

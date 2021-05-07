import java.util.Arrays;

public class ThreeLargestNumbers {
    public static int [] findThreeLargestNumbers (int [] array){
        int [] threeLargestNumbers = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num:array){
            updateLargest(threeLargestNumbers, num);
        }
        return threeLargestNumbers;
    }

// checks if the new number in each iteration is larger that the largest three numbers in our array
    public static void updateLargest(int [] threeLargestNumbers, int num){
        //we start from the largest index to get a sorted array
        if (num>threeLargestNumbers[2]){
            shiftAndUpdate(threeLargestNumbers, num, 2);
        }
        else if (num>threeLargestNumbers[1]){
            shiftAndUpdate(threeLargestNumbers, num, 1);
        }
        else if (num>threeLargestNumbers[0]){
            shiftAndUpdate(threeLargestNumbers, num, 0);
        }
    }

    //this is used to update and shift the elements in case there is a new number larger
    public static void shiftAndUpdate(int [] threeLargestArray, int num, int index){
        for (int i=0; i<=index;i++){
            if (i==index){
                threeLargestArray[i]=num;
            } else {
                threeLargestArray[i]=threeLargestArray[i+1];
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {141,1,17,-7,-17,-27,18,541,8,7,7};
        int [] threeLargest = findThreeLargestNumbers(array);
        System.out.println(Arrays.toString(threeLargest));
    }
}

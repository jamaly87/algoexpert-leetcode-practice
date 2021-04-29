import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for (int num : array){
            int difference=targetSum-num;
            if (set.contains(difference)){
                return new int[] {difference,num};
            }
            else{
                set.add(num);
            }
        }
        return new int[0];
    }
    public static int[] twoNumberSum2 (int[] array, int targetSum) {
        for (int i=0; i<array.length;i++){
            for (int j=i+1; j<array.length;j++){
                if ((array[i]+array[j])==targetSum){
                    return new int[] {array[i],array[j]};
                }
            }
        }
        return new int[0];
    }
}

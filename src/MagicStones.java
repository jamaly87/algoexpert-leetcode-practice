import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicStones {
    public static int magic(List<Integer> stones){
        //sort the list to get the duplicates next to each other
        Collections.sort(stones);
        int i=0;
        while (i<stones.size()-1){
            if(stones.get(i)==stones.get(i+1)){
                stones.remove(i+1);
                int temp=stones.remove(i);
                stones.add(temp+1);
                Collections.sort(stones);
                i=0;
            } else {
                i++;
            }
        }
        return stones.size();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,2));
        System.out.println(magic(list));
    }

}

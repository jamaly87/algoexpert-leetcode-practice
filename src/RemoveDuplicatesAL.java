import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesAL {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> updatedList = new ArrayList<T>();
        for (T element:list){
            if (!updatedList.contains(element)){
                updatedList.add(element);
            }
        }
        return updatedList;
    }

    public static <T> ArrayList<T> removeDuplicates2 (ArrayList<T> list) {
        Set<T> newSet = new LinkedHashSet<T>();
        newSet.addAll(list);
        list.clear();
        list.addAll(newSet);
        return list;

    }

    public static <T> ArrayList<T> removeDuplicates3 (ArrayList<T> list){

       List <T> newList =  list.stream().distinct().collect(Collectors.toList());
        list.clear();
        list.addAll(newList);
        return list;


    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)
        );

//        ArrayList <Integer> newList = removeDuplicates(list);
//        System.out.println(newList);
//        ArrayList<Integer> newList = removeDuplicates2(list);
//        System.out.println(newList);
        ArrayList<Integer> newList = removeDuplicates3(list);
        System.out.println(newList);
    }

}

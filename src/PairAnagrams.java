import java.util.*;
import java.util.stream.Collectors;

public class PairAnagrams {
    public static void main(String[] args) {
        List<String> words=new ArrayList<String>();

        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");

        Map<String, ArrayList<String>> wordsMap = new HashMap<>();
        words.stream().map(word->{
            char[] charArray = word.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }).collect(Collectors.toSet()).forEach(val -> wordsMap.putIfAbsent(val, new ArrayList<>()));

        words.forEach(word -> {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            wordsMap.get(temp).add(word);
        });

        System.out.println(wordsMap.values());
    }
}

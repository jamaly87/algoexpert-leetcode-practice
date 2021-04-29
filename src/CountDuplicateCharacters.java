import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {
    public static Map<Character, Integer> countDuplicate(String str) {
        //declare a Map that will store the character and the number of its occurrences
        Map<Character, Integer> duplicateCounter = new HashMap<Character, Integer>();
        /*convert the input string into an array of characters
        Note: I'll convert all characters to lower case to avoid any potential mismatches.
         */
        char[] inputArray = str.toLowerCase().toCharArray();
        //create for each loop to scan the contents of the array
        for (char c : inputArray) {
            //if char is present in our Map then we'll increment its count by 1
            if (duplicateCounter.containsKey(c))
                duplicateCounter.put(c, duplicateCounter.get(c) + 1);
            /*if char is not present in our then we will add 1 as counter
            note: the else statement will be executed first since our Map in empty
             */
            else
                duplicateCounter.put(c, 1);
        }
        // finally we'll return our updated Map
        return duplicateCounter;
    }
}

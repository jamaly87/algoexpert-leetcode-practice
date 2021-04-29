import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LRUCache {
    public static String LRU(String[] strArr) {
        LinkedList<String> cache = new LinkedList<>();
        for (int i = 0; i < strArr.length; i++) {
            String current = strArr[i];
            if (cache.size() <= 5) {
                if (cache.contains(current)) {
                    cache.remove(current);
                    cache.addLast(current);
                } else {
                    cache.add(current);
                    /*
                    remove the first node when we add a new element
                     which results in increasing the size of LinkedList
                     */
                    if (cache.size()>5)
                        cache.removeFirst();
                }
            }
        }
        return String.join("-",cache);
    }

    public static void main(String[] args) {
        String [] strArr = {"A","B","C","D","E","D","Q","Z","C"};
        System.out.println(LRU(strArr));
    }
}


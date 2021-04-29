import java.util.LinkedList;

public class LRU {
    public static String LRUcache(String[] str){

        LinkedList<String> chache =new LinkedList<>();

        for(int i =0;i<str.length;i++){
            String current =str[i];

            if(chache.size()<=5){
                if(chache.contains(current)) {
                    chache.remove(current);
                    chache.addFirst(current);
                }
                else {
                    chache.addFirst(current);
                    if(chache.size()>5){
                        chache.removeLast();
                    }

                }
            }

        }


        StringBuilder result = new StringBuilder();

        for(int i=chache.size()-1;i>=0;i--){
            if(i==0){
                result.append(chache.remove(i));
                return result.toString();
            }
            result.append(chache.remove(i)+"-");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String [] strArr = {"A","B","C","D","E","D","Q","Z","C"};
        System.out.println(LRUcache(strArr));
    }
}

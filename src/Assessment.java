import java.util.*;
import java.util.stream.Collectors;

public class Assessment {
//    public static void main(String []args){
//        int inside = 0;
//        int total = 0;
//        for (double x = 0; x < 1; x = x + 0.0001) {
//            for (double y = 0; y < 1; y = y + 0.0001) {
//                if (x*x + y*y <= 1) {
//                    inside++;
//                }
//                total++;
//            }
//        }
//        System.out.println("inside : " + inside);
//        System.out.println("total : " + total);
//        System.out.println("Result : " + (4 * inside/ total));
//    }

    /*
    remove character rom string input = banana output = bnn
     */
    public static void main(String[] args) {
        String input = "banana";
        char target = 'a';
        System.out.println(removeChar(input,target));
    }
    private static String removeChar (String input, char target){
        return input.replaceAll(""+target,"");
    }

    }







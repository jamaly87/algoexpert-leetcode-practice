import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckParenthesesAndBrackets {
    public static boolean check(String s){
        //add the parentheses and Brackets to check
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length();i++){
            char item = s.charAt(i);
            if (map.containsKey(item)){
                stack.push(item);
            }
             else if(map.containsValue(item)) {
                if (stack.isEmpty() || map.get(stack.pop()) != item){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(check("[()]"));
    }
}

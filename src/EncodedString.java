import java.util.Stack;

public class EncodedString {
    public static String decodeString(String s) {
        if (s.length() == 0)
            return s;

        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int num = 0;
                while(Character.isDigit(s.charAt(index)))
                {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numStack.push(num);
            } else if (s.charAt(index) == '[') {
                strStack.push(res.toString());
                res = new StringBuilder("");
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeat = numStack.pop();
                for (int i = 0; i < repeat ; i++) {
                    temp.append(res);
                }
                res = temp;
                index++;
            } else {
                res.append(s.charAt(index++));
            }
        }

        return res.toString();
    }
}

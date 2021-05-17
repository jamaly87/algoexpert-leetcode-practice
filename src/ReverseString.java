import java.util.Locale;

public class ReverseString {
    public static String reverseString(String s){
        char[] charArray = s.toCharArray();
        char [] reversedArray = new char[charArray.length];
        int index = 0;
        for (int i= charArray.length-1; i>=0;i--){
            reversedArray[index]=charArray[i];
            index++;
        }
        return String.valueOf(reversedArray).toLowerCase();
    }

    public static String reverseString2(String s){
        char[] charArray = s.toCharArray();
        int start=0;
        int end=charArray.length-1;
        char temp;
        while(start<end){
            temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(charArray).toLowerCase();
    }

    public static void main(String[] args) {
        String s = "Ahmed";
        StringBuffer sbr = new StringBuffer(s);
        System.out.println(reverseString(s));
        System.out.println(reverseString2(s));
    }
}

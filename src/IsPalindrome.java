public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        int leftPointer=0;
        int rightPointer = str.length()-1;
        while (leftPointer<rightPointer){
            if (str.charAt(leftPointer) != str.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }

}

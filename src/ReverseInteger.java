public class ReverseInteger {
    public static int reverseInt (int n){
        int temp=0;
        while (n!=0){
            int pop = n%10;
            n=n/10;
            temp=(temp*10)+pop;
        }
        return temp;
    }

    public static int reverseInt2 (int n){
        char[] chars = Integer.toString(n).toCharArray();
        int start = 0;
        int end =chars.length-1;
        char temp;
        while (start<end){
            temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return Integer.valueOf(String.valueOf(chars));

    }

    public static void main(String[] args) {
        System.out.println(reverseInt(123));
        System.out.println(reverseInt2(12345));
    }
}

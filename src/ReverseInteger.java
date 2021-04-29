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

    public static void main(String[] args) {
        System.out.println(reverseInt(123));
    }
}

public class HammingDistance {

    public static String measureHammingDistance(String[] arrayStr) {
        String firstString = arrayStr[0];
        String secondString = arrayStr[1];
        int count = 0;
        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                count++;
            }
        }
        return String.valueOf(count);
    }

    public static String measureHammingDistance2(String[] arrayStr){
        String a=arrayStr[0];
        String b=arrayStr[1];
        int count =0;
        int k=0, j=0;
        while (k<a.length()){
            if (a.charAt(k) != b.charAt(j)){
                count++;
                k++;
                j++;
            } else {
                k++;
                j++;
            }
        }
        return String.valueOf(count);
    }

    public static void main(String[] args) {
        String[] strArr = {"hamza", "hmmmm"};
        System.out.println(measureHammingDistance(strArr));
        System.out.println(measureHammingDistance2(strArr));

    }
}

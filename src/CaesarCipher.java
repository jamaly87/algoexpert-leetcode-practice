public class CaesarCipher {
    public static String caesarCypherEncryptor(String str, int key) {
        char[] charArray = new char[str.length()];
        int newKey = key % 26; //in case we get bigger key it is safer to use the mod operator to wrap around the characters
        for (int i = 0; i < str.length(); i++) {
            int newCharLocation = newKey + str.charAt(i);
            charArray[i] = getNewLetter(str.charAt(i), newKey);
        }
        return String.valueOf(charArray);
    }

    private static char getNewLetter(char ch, int newKey) {
        int newLetterCode = ch + newKey;
        return newLetterCode<=122 ? (char) newLetterCode : (char) (96+newLetterCode%122);
    }

    public static void main(String[] args) {
        String str = "xyz";
        int key =2;
        System.out.println(caesarCypherEncryptor(str, 2));
    }
}
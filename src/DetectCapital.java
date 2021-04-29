import com.sun.istack.internal.NotNull;

import java.util.function.Predicate;

public class DetectCapital {
    public static boolean detectCapitalUse ( String word){
        if (word.length()<=1) return true; //boundry check
        //Case 1 -> All Capital Letters
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i=2; i<word.length();i++){
                if(Character.isLowerCase(word.charAt(i)))
                    return false;
            }
        }
        // Case 2&3
        else {
            for (int i=1;i<word.length();i++){
                if (Character.isUpperCase(word.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    public static boolean detectCapitalUse2 (String word){
        if (word.length()<=1) return true; // boundary check
       //Case 2 + 3 when the second letters must be all lower cases.
        Predicate<Character> correctCase = Character::isLowerCase;
        //First when all letters are capitals.
        if (Character.isUpperCase(word.charAt(0))&&Character.isUpperCase(word.charAt(1))){
            correctCase=Character::isUpperCase;
        }


        for (int i=1; i<word.length();i++){
            if (!correctCase.test(word.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aaaAaaa";
        String b="ApplE";
        System.out.println(detectCapitalUse(a));
        System.out.println(detectCapitalUse(b));
        System.out.println(detectCapitalUse2(a));
        System.out.println(detectCapitalUse2(b));

    }
}

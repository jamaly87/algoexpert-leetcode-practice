public class RunLengthEncoding {

    public static String runLengthEncoding(String string){
        StringBuilder sb = new StringBuilder();
        int currentRunLength = 1; //Because we are having a non empty string in all conditions
        for (int i=1; i<string.length();i++){
            char previousCharacter = string.charAt(i-1);
            char currentCharacter = string.charAt(i);
            if(currentCharacter!=previousCharacter || currentRunLength ==9){
                sb.append(Integer.toString(currentRunLength));
                sb.append(previousCharacter);
                currentRunLength=0; //we reset to zero becuase we will add 1 in the next step no matter what
            }
            currentRunLength+=1;
        }
        //last part of the string
        sb.append(Integer.toString(currentRunLength));
        sb.append(string.charAt(string.length()-1));

        return sb.toString();
    }

    public static void main(String[] args) {
        String test = "AAAAAAAAAAAAAABBCCDD";
        System.out.println(runLengthEncoding(test));
    }
}

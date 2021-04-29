import java.util.List;

public class ValidSubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int subSeqIdx = 0 ;
        for (int num:array){
            if (subSeqIdx == sequence.size()){
                break;
            }
            if (sequence.get(subSeqIdx).equals(num)){
                subSeqIdx++;
            }
        }
        return subSeqIdx==sequence.size();
    }
}

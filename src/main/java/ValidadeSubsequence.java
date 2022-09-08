import java.util.List;

public class ValidadeSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i = 0;
        // Write your code here.
        for (Integer integer : array) {
            if (integer.equals(sequence.get(i))) {
                i++;
            }
            if (i == sequence.size()) {
                return true;
            }
        }
        return false;
    }
}

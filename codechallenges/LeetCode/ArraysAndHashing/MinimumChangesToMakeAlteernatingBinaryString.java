package ArraysAndHashing;

public class MinimumChangesToMakeAlteernatingBinaryString {
    public int minOperations(String s) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {
            int correctA = (i % 2 == 0) ? '0' : '1';
            int correctB = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != correctA) countA++;
            if (s.charAt(i) != correctB) countB++;
        }
        return Math.min(countA, countB);
    }
}

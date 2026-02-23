// https://leetcode.com/problems/valid-palindrome-ii/
package TwoPointer;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        char[] charArray = s.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase().trim().toCharArray();
        int misses = 0;
        for(int i = 0, j = charArray.length - 1; i <= j; i++, j--){
            if(charArray[i] != charArray[j]){
                return isPalindrome(charArray, i + 1, j) || isPalindrome(charArray, i, j -1);
            }
        }
        return true;
    }
    public boolean isPalindrome(char[] array, int l, int r){
        for(int k = l, m = r; k <= m; k++, m--){
            if(array[k] != array[m]){
                return false;
            }
        }
        return true;
    }
}

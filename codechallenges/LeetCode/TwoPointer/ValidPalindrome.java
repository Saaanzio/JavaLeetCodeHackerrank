package TwoPointer;
class ValidPalindrome{
    public boolean isPalindrome(String s) {
        char[] arr = s.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase().trim().toCharArray();
        for(int i = 0, j = arr.length - 1; i <= j; i++, j--){
            if(arr[i] != arr[j]) return false;
        }
        return true;
    }
}
//Character.isLetterOrDigit(c);
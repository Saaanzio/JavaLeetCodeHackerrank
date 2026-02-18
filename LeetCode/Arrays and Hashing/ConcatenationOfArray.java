import java.util.Arrays;


class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i = 0; i < ans.length; i++){
            if(i < nums.length) ans[i] = nums[i];
            else ans[i] = nums[i - nums.length];
        }
        return ans;
    }
}


// public int[] getConcatenation(int[] nums) {
//     int len = nums.length;
//     int[] ans = new int[2*len];
//     for(int i = 0; i < len; i++){
//         ans[i] = nums[i];
//         ans[i+len] = nums[i];
//     }
//     return ans;
// }
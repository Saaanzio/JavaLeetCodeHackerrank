// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package TwoPointer;

//public class Solution {
//    public int removeDuplicates(int[] nums) {
//        int l = 1;
//        for (int r = 1; r < nums.length; r++) {
//            if (nums[r] != nums[r - 1]) {
//                nums[l++] = nums[r];
//            }
//        }
//        return l;
//    }
//}
//
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        int i = 1;
//
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i - 1]) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//
//        return i;
//    }
//}

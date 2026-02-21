package SlidingWindow;

import java.util.HashSet;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0, r = 0;
        while (r < nums.length){
            if( r - l > k){
                set.remove(nums[l]);
                l++;
            }
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
            r++;
        }
        return false;
    }


}

    //      Map<Integer, Integer> seen = new HashMap<>();
    //
    //        for (int i = 0; i < nums.length; i++) {
    //            int val = nums[i];
    //            if (seen.containsKey(val) && i - seen.get(val) <= k) {
            //        return true;
            //    }
            //    seen.put(val, i);
            // }
    //
    //        return false;

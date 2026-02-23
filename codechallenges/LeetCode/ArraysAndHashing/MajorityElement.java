// https://leetcode.com/problems/majority-element/
package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int value = numbers.getOrDefault(nums[i], 0);
            numbers.put(nums[i], value + 1);
        }
        int majority = -1;
        int maxAmmount = -1;
        for(Map.Entry<Integer, Integer> entries: numbers.entrySet()){
            if(entries.getValue() > maxAmmount){
                majority = entries.getKey();
                maxAmmount = entries.getValue();
            }
        }
        return majority;
    }
}

// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> hash = new HashMap<>();
//         int res = 0;
//         int majority = 0;

//         for (int n : nums) {
//             hash.put(n, 1 + hash.getOrDefault(n, 0));
//             if (hash.get(n) > majority) {
//                 res = n;
//                 majority = hash.get(n);
//             }
//         }

//         return res;        
//     }
// }

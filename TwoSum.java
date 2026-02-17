import java.util.HashMap;

//Minha solução
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsPresent = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(numsPresent.containsKey(target - nums[i])){
                int[] ans = {numsPresent.get(target - nums[i]),i};
                return ans;
            }
            else{
                numsPresent.put(nums[i], i);
            }
        }
        return new int[0];
    }
}

//Melhor solução
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> pairIdx = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             int num = nums[i];
//             if (pairIdx.containsKey(target - num)) {
//                 return new int[] { i, pairIdx.get(target - num) };
//             }
//             pairIdx.put(num, i);
//         }

//         return new int[] {};        
//     }
// }

package ArraysAndHashing;

import java.util.HashMap;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum > target){
                r--;
            }
            else if (sum < target){
                l--;
            }
            else{
                return new int[]{(l+1),(r+1)};
            }
        }
        return new int[]{};
    }
}

//public class TwoSumII {
//    public int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < numbers.length; i++){
//            if(map.containsKey(target - numbers[i])){
//                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
//            }
//            else{
//                map.put(numbers[i], i);
//            }
//        }
//        return new int[] {};
//    }
//}

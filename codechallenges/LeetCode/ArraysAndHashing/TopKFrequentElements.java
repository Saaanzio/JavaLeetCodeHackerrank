// https://leetcode.com/problems/top-k-frequent-elements/
package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] kfrequent = new int[k];
        for(int i = 0; i < k; i++){
            kfrequent[i] = arr.get(i)[1];
        }
        return kfrequent;
    }
}

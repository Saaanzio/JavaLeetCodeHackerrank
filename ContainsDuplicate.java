
import java.util.HashMap;

//A minha solução, que é a mais efetiva ;)
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hashMap.containsKey(nums[i]))
                hashMap.put(nums[i], i);
            else return true;
        }
        return false;
    }
}

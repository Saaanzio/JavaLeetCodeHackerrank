package ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }
            group.get(key).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: group.entrySet()){

            result.add(entry.getValue());
        }
        return result;
    }
}
//public List<List<String>> groupAnagrams(String[] strs) {
//    Map<String, List<String>> res = new HashMap<>();
//    for (String s : strs) {
//        char[] charArray = s.toCharArray();
//        Arrays.sort(charArray);
//        String sortedS = new String(charArray);
//        res.putIfAbsent(sortedS, new ArrayList<>());
//        res.get(sortedS).add(s);
//    }
//    return new ArrayList<>(res.values());
//}
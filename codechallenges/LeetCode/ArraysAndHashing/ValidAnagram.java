package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> firstWord = new HashMap<>();
        HashMap<Character, Integer> secondWord = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            firstWord.put(s.charAt(i), firstWord.getOrDefault(s.charAt(i), 0) + 1);
            secondWord.put(t.charAt(i), secondWord.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> pares : firstWord.entrySet()){
            if(!pares.getValue().equals(secondWord.getOrDefault(pares.getKey(), 0))){
                return false;
            }
        }
        return true;
    }
}


// public boolean isAnagram(String s, String t) {
//     int[] alphabet = new int[26];
//     for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
//     for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
//     for (int i : alphabet) if (i != 0) return false;
//     return true;
// }


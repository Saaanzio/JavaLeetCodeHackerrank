// https://leetcode.com/problems/longest-common-prefix/
package ArraysAndHashing;

import java.util.Arrays;


class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String maxPrefix = "";
        for(int i = 0; i < strs[0].length(); i++){
            char[] word = strs[0].toCharArray();
            String prefix = maxPrefix + word[i];
            if(Arrays.stream(strs).allMatch(s -> s.startsWith(prefix))){
                maxPrefix += word[i];
            }
        }
        return maxPrefix;
    }
}


// class Solution {
//     public String longestCommonPrefix(String[] v) {
//         StringBuilder ans = new StringBuilder();
//         Arrays.sort(v);
//         String first = v[0];
//         String last = v[v.length-1];
//         for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//             if (first.charAt(i) != last.charAt(i)) {
//                 return ans.toString();
//             }
//             ans.append(first.charAt(i));
//         }
//         return ans.toString();
//     }
// }
//
// Comentário explicando:
// The big brained concept here seems to be this:
// If the array is sorted alphabetically then you can assume that the first element of the array and the last element of the array will have most different prefixes of all comparisons that could be made between strings in the array. If this is true, you only have to compare these two strings.
//
//
//Detalhes importantes: Uso de StringBuilder e o uso de Math.min para determinar qual a menor String entre a primeira e a última
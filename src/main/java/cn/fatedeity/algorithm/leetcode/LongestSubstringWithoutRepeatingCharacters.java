package cn.fatedeity.algorithm.leetcode;

import java.util.HashMap;

/**
 * 无重复字符的最长子串
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int answer(String s) {
        int start = 0;
        int result = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int current = 0; current < s.length(); current++) {
            char c = s.charAt(current);
            if (hashMap.containsKey(c)) {
                start = Math.max(hashMap.get(c) + 1, start);
            }
            hashMap.put(c, current);
            result = Math.max(current - start + 1, result);
        }
        return result;
    }
}

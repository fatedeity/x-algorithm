package cn.fatedeity.algorithm.leetcode;

import java.util.HashMap;

/**
 * 两数之和
 */
public class TwoSum {
    public int[] answer(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                return new int[]{hashMap.get(diff), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}

package com.study.leetcode;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> mappings = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mappings.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer search;
            if (mappings.containsKey(complement)
                    && (search = mappings.get(complement)) != i) {
                result[0] = i;
                result[1] = search;
                break;
            }
        }
        return result;
    }
}

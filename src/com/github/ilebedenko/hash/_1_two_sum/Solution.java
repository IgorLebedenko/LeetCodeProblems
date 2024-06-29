package com.github.ilebedenko.hash._1_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            else
                map.put(target - nums[i], i);
        }

        throw new IllegalArgumentException();
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        assert Arrays.equals(result, new int[]{0, 1});

        // Example 2
        nums = new int[]{3, 2, 4};
        target = 6;
        result = twoSum(nums, target);
        assert Arrays.equals(result, new int[]{1, 2});

        // Example 1
        nums = new int[]{3, 3};
        target = 6;
        result = twoSum(nums, target);
        assert Arrays.equals(result, new int[]{0, 1});
    }
}

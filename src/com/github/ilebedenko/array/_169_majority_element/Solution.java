package com.github.ilebedenko.array._169_majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int half = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() > half)
                return entry.getKey();

        throw new IllegalStateException();
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{3, 2, 3};
        int element = majorityElement(nums);
        assert element == 3;

        // Example 2
        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        element = majorityElement(nums);
        assert element == 2;
    }
}

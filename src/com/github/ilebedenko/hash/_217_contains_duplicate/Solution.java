package com.github.ilebedenko.hash._217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();

        for (int x : nums)
            if (!elements.add(x))
                return true;

        return false;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        assert result;

        // Example 2
        nums = new int[]{1, 2, 3, 4};
        result = containsDuplicate(nums);
        assert !result;

        // Example 3
        nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        result = containsDuplicate(nums);
        assert result;
    }
}

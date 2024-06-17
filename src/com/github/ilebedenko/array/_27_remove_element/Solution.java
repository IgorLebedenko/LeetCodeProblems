package com.github.ilebedenko.array._27_remove_element;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int nonValCount = removeElement(nums, val);
        sort(nums, 0, nonValCount);
        assert nonValCount == 2;
        assert Arrays.equals(nums, 0, nonValCount, new int[]{2, 2}, 0, nonValCount);

        // Example 2
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        nonValCount = removeElement(nums, val);
        sort(nums, 0, nonValCount);
        assert nonValCount == 5;
        assert Arrays.equals(nums, 0, nonValCount, new int[]{0, 0, 1, 3, 4}, 0, nonValCount);
    }
}

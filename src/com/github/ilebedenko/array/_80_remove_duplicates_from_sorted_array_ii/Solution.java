package com.github.ilebedenko.array._80_remove_duplicates_from_sorted_array_ii;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int uniqueElements = removeDuplicates(nums);
        sort(nums, 0, uniqueElements);
        assert uniqueElements == 5;
        assert Arrays.equals(nums, 0, uniqueElements, new int[]{1, 1, 2, 2, 3}, 0, uniqueElements);

        // Example 2
        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        uniqueElements = removeDuplicates(nums);
        sort(nums, 0, uniqueElements);
        assert uniqueElements == 7;
        assert Arrays.equals(nums, 0, uniqueElements, new int[]{0, 0, 1, 1, 2, 3, 3}, 0, uniqueElements);

        // Example 3
        nums = new int[]{0};
        uniqueElements = removeDuplicates(nums);
        sort(nums, 0, uniqueElements);
        assert uniqueElements == 1;
        assert Arrays.equals(nums, 0, uniqueElements, new int[]{0}, 0, uniqueElements);
    }
}

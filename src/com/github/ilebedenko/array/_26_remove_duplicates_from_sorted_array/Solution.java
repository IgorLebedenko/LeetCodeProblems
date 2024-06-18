package com.github.ilebedenko.array._26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{1, 1, 2};
        int uniqueElements = removeDuplicates(nums);
        sort(nums, 0, uniqueElements);
        assert uniqueElements == 2;
        assert Arrays.equals(nums, 0, uniqueElements, new int[]{1, 2}, 0, uniqueElements);

        // Example 2
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        uniqueElements = removeDuplicates(nums);
        sort(nums, 0, uniqueElements);
        assert uniqueElements == 5;
        assert Arrays.equals(nums, 0, uniqueElements, new int[]{0, 1, 2, 3, 4}, 0, uniqueElements);
    }
}

package com.github.ilebedenko.array._238_product_of_array_except_self;

import java.util.Arrays;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < result.length; i++)
            result[i] = result[i - 1] * nums[i - 1];

        int rightProduct = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        assert Arrays.equals(result, new int[]{24, 12, 8, 6});

        // Example 2
        nums = new int[]{-1, 1, 0, -3, 3};
        result = productExceptSelf(nums);
        assert Arrays.equals(result, new int[]{0, 0, 9, 0, 0});
    }
}

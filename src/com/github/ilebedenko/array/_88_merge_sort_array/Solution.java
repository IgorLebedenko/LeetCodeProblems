package com.github.ilebedenko.array._88_merge_sort_array;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;

        int firstArrayIdx = m - 1;
        int secondArrayIdx = n - 1;
        int resultIdx = m + n - 1;

        while (firstArrayIdx >= 0 && secondArrayIdx >= 0) {
            if (nums1[firstArrayIdx] > nums2[secondArrayIdx]) {
                nums1[resultIdx] = nums1[firstArrayIdx];
                firstArrayIdx--;
            } else {
                nums1[resultIdx] = nums2[secondArrayIdx];
                secondArrayIdx--;
            }
            resultIdx--;
        }

        if (secondArrayIdx >= 0) {
            while (secondArrayIdx >= 0) {
                nums1[resultIdx] = nums2[secondArrayIdx];
                secondArrayIdx--;
                resultIdx--;
            }
        }
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        assert Arrays.equals(nums1, new int[]{1, 2, 2, 3, 5, 6});

        // Example 2
        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        merge(nums1, m, nums2, n);
        assert Arrays.equals(nums1, new int[]{1});

        // Example 3
        nums1 = new int[]{0};
        m = 0;
        nums2 = new int[]{1};
        n = 1;
        merge(nums1, m, nums2, n);
        assert Arrays.equals(nums1, new int[]{1});
    }
}

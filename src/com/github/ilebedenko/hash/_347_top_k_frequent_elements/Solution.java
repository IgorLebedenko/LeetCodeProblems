package com.github.ilebedenko.hash._347_top_k_frequent_elements;

import java.util.*;

public class Solution {
    // Time: O(n)   Space: O(n)
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int x : nums)
            numFreq.put(x, numFreq.getOrDefault(x, 0) + 1);

        List<Integer>[] freq = new List[nums.length + 1];
        int[] result = new int[k];
        for (int i = 0; i < freq.length; i++)
            freq[i] = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet())
            freq[entry.getValue()].add(entry.getKey());

        int resultIdx = 0;
        for (int i = freq.length - 1; i >= 1; i--) {
            for (int x : freq[i]) {
                result[resultIdx++] = x;
                if (resultIdx == k)
                    return result;
            }
        }

        return result;
    }

    // Time: O(nlogn)   Space: O(n)
    public static int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int x : nums)
            numFreq.put(x, numFreq.getOrDefault(x, 0) + 1);

        int kMaxValue = numFreq.values().stream()
                .sorted(Comparator.reverseOrder())
                .skip(k - 1)
                .findFirst()
                .get();

        return numFreq.entrySet().stream()
                .filter(e -> e.getValue() >= kMaxValue)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }


    public static void main(String[] args) {
        // Example 1
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        assert Arrays.equals(result, new int[]{1, 2});

        // Example 2
        nums = new int[]{1};
        k = 1;
        result = topKFrequent(nums, k);
        assert Arrays.equals(result, new int[]{1});
    }
}

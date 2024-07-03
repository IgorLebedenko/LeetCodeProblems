package com.github.ilebedenko.hash._49_group_anagrams;

import java.util.*;

public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String ordered = new String(chars);

            if (!map.containsKey(ordered))
                map.put(ordered, new ArrayList<>());
            map.get(ordered).add(s);
        }

        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        // Example 1
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        assert result.equals(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")));

        // Example 2
        strs = new String[]{""};
        result = groupAnagrams(strs);
        assert result.equals(List.of(List.of("")));

        // Example 3
        strs = new String[]{"a"};
        result = groupAnagrams(strs);
        assert result.equals(List.of(List.of("a")));
    }
}

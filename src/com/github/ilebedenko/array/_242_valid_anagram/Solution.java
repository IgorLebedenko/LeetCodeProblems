package com.github.ilebedenko.array._242_valid_anagram;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] lettersNum = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lettersNum[s.charAt(i) - 'a']++;
            lettersNum[t.charAt(i) - 'a']--;
        }

        for (int x : lettersNum)
            if (x != 0)
                return false;

        return true;
    }


    public static void main(String[] args) {
        // Example 1
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        assert result;

        // Example 2
        s = "rat";
        t = "car";
        result = isAnagram(s, t);
        assert !result;
    }
}

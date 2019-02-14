package com.study.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        int result = 0, i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!uniqueChars.contains(s.charAt(j))){
                uniqueChars.add(s.charAt(j++));
                result = Math.max(result, j - i);
            }
            else {
                uniqueChars.remove(s.charAt(i++));
            }
        }
        return result;
    }
}

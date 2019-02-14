package com.study.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
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

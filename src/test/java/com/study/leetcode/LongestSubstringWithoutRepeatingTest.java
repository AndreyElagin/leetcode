package com.study.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.study.leetcode.LongestSubstringWithoutRepeating.lengthOfLongestSubstring;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {

    @Test
    @DisplayName("abcabcbb")
    public void test1() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @DisplayName("bbbbb")
    public void test2() {
        assertEquals(1, lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @DisplayName("pwwkew")
    public void test3() {
        assertEquals(3, lengthOfLongestSubstring("pwwkew"));
    }


    @Test
    @DisplayName("aab")
    public void test4() {
        assertEquals(2, lengthOfLongestSubstring("aab"));
    }

    @Test
    @DisplayName("dvdf")
    public void test5() {
        assertEquals(3, lengthOfLongestSubstring("dvdf"));
    }
}
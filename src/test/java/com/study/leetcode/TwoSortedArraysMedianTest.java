package com.study.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSortedArraysMedianTest {

    @Test
    @DisplayName("firstLast less than secondFirst")
    public void test1() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double median = TwoSortedArraysMedian.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.5, median);
    }

    @Test
    @DisplayName("firstFirst greater than secondLast")
    public void test2() {
        int[] nums1 = new int[]{8, 9};
        int[] nums2 = new int[]{1, 2};
        double median = TwoSortedArraysMedian.findMedianSortedArrays(nums1, nums2);

        assertEquals(5, median);
    }
}
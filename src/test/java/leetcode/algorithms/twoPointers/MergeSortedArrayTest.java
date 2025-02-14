package leetcode.algorithms.twoPointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArrayTest {
    @Test
    void testBasicCase() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testNums2Empty() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        solution.merge(nums1, 3, nums2, 0);
        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    void testNums1Empty() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testLargerNumbers() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }
}
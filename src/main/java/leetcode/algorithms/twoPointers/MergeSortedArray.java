package leetcode.algorithms.twoPointers;
import java.util.*;

/*
* 88. Merge Sorted Array
*
* Example 1:
* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
* Output: [1,2,2,3,5,6]
*
* */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // two pointers from right to left
        int i = m - 1, j = n - 1;
        int p = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[p] = nums1[i];
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }

        while (j >= 0) {
            nums1[p] = nums2[j];
            p--;
            j--;
        }
    }
}

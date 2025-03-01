package leetcode.algorithms.binarySearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchRangeTest {
    private final SearchRange solution = new SearchRange();

    @Test
    public void testBasicCase() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetNotFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testSingleElementArrayWithTarget() {
        int[] nums = {5};
        int target = 5;
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testSingleElementArrayWithoutTarget() {
        int[] nums = {5};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testAllElementsAreTarget() {
        int[] nums = {8, 8, 8, 8, 8};
        int target = 8;
        int[] expected = {0, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetAtBeginning() {
        int[] nums = {8, 8, 9, 10, 11};
        int target = 8;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetAtEnd() {
        int[] nums = {5, 6, 7, 8, 8};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetAppearingOnce() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 3;
        int[] expected = {2, 2};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 300; i++) nums[i] = 1;
        for (int i = 300; i < 800; i++) nums[i] = 2;
        for (int i = 800; i < 1000; i++) nums[i] = 3;

        int target = 2;
        int[] expected = {300, 799};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetSmallerThanAll() {
        int[] nums = {5, 6, 7, 8};
        int target = 4;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetLargerThanAll() {
        int[] nums = {5, 6, 7, 8};
        int target = 9;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }
}
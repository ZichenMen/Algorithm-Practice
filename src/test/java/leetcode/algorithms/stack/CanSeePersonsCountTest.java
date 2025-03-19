package leetcode.algorithms.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanSeePersonsCountTest {
    private final Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] heights = {10, 6, 8, 5, 11, 9};
        int[] expected = {3, 1, 2, 1, 1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testExample2() {
        int[] heights = {5, 1, 2, 3, 10};
        int[] expected = {4, 1, 1, 1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testAllSameHeight() {
        int[] heights = {5, 5, 5, 5, 5};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testIncreasingHeights() {
        int[] heights = {1, 2, 3, 4, 5};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testDecreasingHeights() {
        int[] heights = {5, 4, 3, 2, 1};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testSinglePerson() {
        int[] heights = {7};
        int[] expected = {0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testTwoPeople() {
        int[] heights = {3, 1};
        int[] expected = {1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }

    @Test
    public void testComplexPattern() {
        int[] heights = {8, 3, 14, 5, 10, 9, 2, 7};
        int[] expected = {2, 1, 2, 1, 1, 2, 1, 0};
        assertArrayEquals(expected, solution.canSeePersonsCount(heights));
    }
}
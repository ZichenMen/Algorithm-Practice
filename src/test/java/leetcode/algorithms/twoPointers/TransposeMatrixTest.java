package leetcode.algorithms.twoPointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransposeMatrixTest {
    private final TransposeMatrix solution = new TransposeMatrix();

    @Test
    public void testSquareMatrix() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        assertArrayEquals(expected, solution.transpose(input));
    }

    @Test
    public void testRectangularMatrix() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] expected = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        assertArrayEquals(expected, solution.transpose(input));
    }

    @Test
    public void testSingleRowMatrix() {
        int[][] input = {{1, 2, 3}};
        int[][] expected = {
                {1},
                {2},
                {3}
        };
        assertArrayEquals(expected, solution.transpose(input));
    }

    @Test
    public void testSingleColumnMatrix() {
        int[][] input = {
                {1},
                {2},
                {3}
        };
        int[][] expected = {{1, 2, 3}};
        assertArrayEquals(expected, solution.transpose(input));
    }

    @Test
    public void testSingleElementMatrix() {
        int[][] input = {{1}};
        int[][] expected = {{1}};
        assertArrayEquals(expected, solution.transpose(input));
    }

    @Test
    public void testZeroMatrix() {
        int[][] input = {
                {0, 0},
                {0, 0}
        };
        int[][] expected = {
                {0, 0},
                {0, 0}
        };
        assertArrayEquals(expected, solution.transpose(input));
    }
}
package leetcode.algorithms.preSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarPoolingTest {
    private final CarPooling solution = new CarPooling();

    @Test
    public void testExample1() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        assertFalse(solution.carPooling(trips, capacity), "Should return false as capacity is exceeded at station 3");
    }

    @Test
    public void testExample2() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        assertTrue(solution.carPooling(trips, capacity), "Should return true as capacity is never exceeded");
    }

    @Test
    public void testExample3() {
        int[][] trips = {{2, 1, 5}, {3, 5, 7}};
        int capacity = 3;
        assertTrue(solution.carPooling(trips, capacity), "Should return true as passengers never overlap beyond capacity");
    }

    @Test
    public void testSingleTrip() {
        int[][] trips = {{3, 2, 8}};
        int capacity = 3;
        assertTrue(solution.carPooling(trips, capacity), "Should return true for a single trip within capacity");
    }

    @Test
    public void testSingleTripExceedingCapacity() {
        int[][] trips = {{5, 2, 8}};
        int capacity = 4;
        assertFalse(solution.carPooling(trips, capacity), "Should return false for a single trip exceeding capacity");
    }

    @Test
    public void testMultipleTripsWithGap() {
        int[][] trips = {{2, 1, 3}, {3, 5, 7}};
        int capacity = 3;
        assertTrue(solution.carPooling(trips, capacity), "Should return true as trips have a gap between them");
    }

    @Test
    public void testMultipleTripsOverlappingExactly() {
        int[][] trips = {{2, 1, 5}, {3, 5, 7}};
        int capacity = 3;
        assertTrue(solution.carPooling(trips, capacity), "Should return true as the second trip starts exactly when first ends");
    }

    @Test
    public void testMaximumBoundary() {
        int[][] trips = {{1, 0, 1000}};
        int capacity = 1;
        assertTrue(solution.carPooling(trips, capacity), "Should return true for maximum boundary case");
    }

    @Test
    public void testComplexScenario() {
        int[][] trips = {{3, 2, 7}, {1, 3, 5}, {2, 5, 8}};
        int capacity = 5;
        assertTrue(solution.carPooling(trips, capacity), "Should handle complex overlapping scenarios correctly");
    }

    @Test
    public void testComplexScenarioExceedingCapacity() {
        int[][] trips = {{3, 2, 8}, {2, 3, 6}, {2, 5, 9}};
        int capacity = 5;
        assertFalse(solution.carPooling(trips, capacity), "Should detect capacity exceeded in complex scenario");
    }
}
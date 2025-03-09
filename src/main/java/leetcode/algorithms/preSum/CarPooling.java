package leetcode.algorithms.preSum;
import java.util.*;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1001];
        Diff df = new Diff(nums);
        for (int[] trip : trips) {
            int val = trip[0];
            int i = trip[1];
            int j = trip[2] - 1;
            df.increment(i, j, val);
        }

        int[] res = df.result();
        for (int i = 0; i < res.length; i++) {
            if (res[i] > capacity) {
                return false;
            }
        }

        return true;
    }
}

class Diff {
    int[] diff;
    public Diff(int[] nums) {
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < diff.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    public void increment(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) diff[j + 1] -= val;
    }

    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}

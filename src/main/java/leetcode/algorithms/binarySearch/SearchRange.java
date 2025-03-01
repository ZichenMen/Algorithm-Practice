package leetcode.algorithms.binarySearch;
/*
* Leetcode 34
*
*
* */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findLeftBound(nums, target), findRightBound(nums, target)};
    }

    public int findLeftBound(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] == target) {
                r = mid - 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (l >= nums.length || nums[l] != target) return -1;
        return l;
    }

    public int findRightBound(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] == target) {
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        if (r < 0 || nums[r] != target) return -1;
        return r;
    }
}

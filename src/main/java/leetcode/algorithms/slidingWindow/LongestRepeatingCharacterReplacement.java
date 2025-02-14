package leetcode.algorithms.slidingWindow;
import java.util.*;

public class LongestRepeatingCharacterReplacement {
    // Leetcode 424
    // input: "AABABBA", 1, output: 4
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int res = 0;
        int l = 0, r = 0;

        while (r < s.length()) {
            count[s.charAt(r) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(r) - 'A']);
            r++;
            // since r just ++, the interval is [l, r)
            while (r - l - maxCount > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r - l);
        }

        return res;
    }
}

package leetcode.algorithms.slidingWindow;
import java.util.HashMap;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int valid = 0;
        int l = 0, r = 0;

        while (r < s2.length()) {
            Character curr = s2.charAt(r);
            r++;

            if (need.containsKey(curr)) {
                window.put(curr, window.getOrDefault(curr, 0) + 1);
                if (need.get(curr).intValue() == window.get(curr).intValue()) {
                    valid++;
                }
            }

            if (valid == need.size()) return true;

            while (r - l >= s1.length()) {
                curr = s2.charAt(l);
                l++;
                if (need.containsKey(curr)) {
                    if (need.get(curr).intValue() == window.get(curr).intValue()) {
                        valid--;
                    }
                    window.put(curr, window.get(curr) - 1);
                }
            }
        }
        return false;
    }
}
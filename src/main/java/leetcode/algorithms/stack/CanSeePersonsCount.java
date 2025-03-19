package leetcode.algorithms.stack;
import java.util.*;
// Leetcode Q1944
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            int count = 0;
            // count all person shorter than ith person
            while (!stack.isEmpty() && stack.peek() < heights[i]) {
                stack.pop();
                count++;
            }
            // if stack is empty, there is no person higher than ith person, returns count
            // if stack is not empty, there is a higher person in sight, count+1
            res[i] = stack.isEmpty() ? count : count + 1;
            stack.push(heights[i]);
        }
        return res;
    }
}
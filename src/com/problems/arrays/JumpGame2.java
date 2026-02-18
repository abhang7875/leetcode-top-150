package com.problems.arrays;

// Problem - 55
public class JumpGame2 {
    public int jump(int[] nums) {
        int right = 0, left = 0, n = nums.length;
        int steps = 0;
        while (right < n - 1) {
            int max = 0;
            for (int i = left; i <= right; i++) {
                max = Math.max(nums[i] + i, max);
            }
            left = right;
            right = max;
            steps++;
        }
        return steps;
    }
}

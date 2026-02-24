package com.problems.slidingwindow;

// Problem - 209
public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = n + 1;
        int left = 0, right = 0;
        int currSum = 0;
        while (left < n) {
            if (currSum >= target) {
                min = Math.min(min, right - left);
                currSum -= nums[left++];
            } else if (right < n) {
                currSum += nums[right++];
            } else {
                break;
            }
        }
        return min == nums.length + 1 ? 0 : min;
    }
}

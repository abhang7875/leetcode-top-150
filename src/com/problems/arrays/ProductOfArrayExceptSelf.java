package com.problems.arrays;

//Problem - 238
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        right[0] = 1;
        for (int i = 1; i < n; i++) {
            right[i] = right[i - 1] * nums[i - 1];
        }
        int left = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] *= left;
            left *= nums[i];
        }
        return right;
    }
}

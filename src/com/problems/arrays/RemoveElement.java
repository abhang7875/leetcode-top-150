package com.problems.arrays;

// Problem - 27
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int z = 0;
        for (int i : nums) {
            if (i != val) nums[z++] = i;
        }
        return z;
    }
}

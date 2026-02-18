package com.problems.arrays;

// Problem - 80
public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, z = 1, count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) {
                    nums[z++] = nums[i];
                }
                count++;
            } else {
                count = 1;
                nums[z++] = nums[i];
            }

        }
        return z;
    }
}

package com.problems.arrays;

// Problem - 134
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int costSum = 0, gasSum = 0;
        for (int i : cost) costSum += i;
        for (int i : gas) gasSum += i;
        if (costSum > gasSum) return -1;
        int rem = 0;
        int n = gas.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            rem += (gas[i] - cost[i]);
            if (rem < 0) {
                rem = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}

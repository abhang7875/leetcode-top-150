package com.problems.arrays;

//Problem - 122
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0, n = prices.length;
        for (int i = 0; i < n; ) {
            int index = i;
            while (index < n - 1 && prices[index] < prices[index + 1]) {
                index++;
            }
            if (index > i) profit += (prices[index] - prices[i]);
            i = index + 1;
        }
        return profit;
    }
}

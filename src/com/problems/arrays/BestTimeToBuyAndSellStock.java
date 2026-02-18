package com.problems.arrays;

//Problem - 121
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0, curr = prices[0], n = prices.length;
        for (int i : prices) {
            if (i - curr > profit) {
                profit = i - curr;
            }
            curr = Math.min(curr, i);
        }
        return profit;
    }
}

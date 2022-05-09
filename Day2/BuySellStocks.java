package com.dileep.Day2;

public class BuySellStocks {
    class Solution {
        public int maxProfit(int[] prices) {



            int min = Integer.MAX_VALUE;
            int max = 0;

            for(int i=0; i<prices.length; i++) {
                if(min > prices[i]) min = prices[i];

                if(prices[i]-min > max) max = prices[i]-min;
            }

            return max;



        }
    }

}

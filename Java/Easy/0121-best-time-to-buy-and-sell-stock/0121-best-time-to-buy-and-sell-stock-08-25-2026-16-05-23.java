class Solution {
    public int maxProfit(int[] prices) {
     int maxProf = 0;
     int lowest = 0;
     for (int i = 1; i < prices.length; i++) {
        if ((prices[i] - prices[lowest]) > maxProf) {
            maxProf = prices[i] - prices[lowest];
        }
        else if (prices[lowest] > prices[i]) {
            lowest = i;
        }
     }
     return maxProf;   
    }
}
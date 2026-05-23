class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++){
            int mini = prices[i];
            for  (int j = i +1; j< prices.length; j++){
                if (prices[j]>prices[i]){
                    int profit = prices[j] - mini;
                    if (profit>max_profit){
                        max_profit = profit;
                    }
                }
            }
        }
        return max_profit;
    }
}

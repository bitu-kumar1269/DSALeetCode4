class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[min]){
                int profit = prices[i] - prices[min];
                max = Math.max(max, profit);
            }else{
                min = i;
            }
        }
        return max;

    }
}
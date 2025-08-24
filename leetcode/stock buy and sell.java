class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i : prices) {
            max = Math.max(max, i - min);
            min = Math.min(min  ,i );
        }
        return max;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minbuy = prices[0];
        for(int sell:prices){
            maxprofit = Math.max(maxprofit,sell-minbuy);
            minbuy = Math.min(minbuy,sell);
        }
        return maxprofit;
    }
}

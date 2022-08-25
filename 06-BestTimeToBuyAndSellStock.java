class Solution {
    //TC - O(N)
    //SC - O(1)
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int curMin = prices[0];
        int res = 0;
        for(int i=1; i<len; ++i){
            res = Math.max(res, prices[i] - curMin);
            curMin = Math.min(curMin, prices[i]);
        }
        
        return res;
    }
}

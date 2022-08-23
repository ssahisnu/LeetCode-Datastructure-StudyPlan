class Solution {
    public int maxSubArray(int[] nums) {
        //Kandane's Algo
        if(nums==null || nums.length==0) return 0;
        int curMax = 0;
        int res = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; ++i) {
            curMax = curMax + nums[i]; //ensures atleast one num is picked from Array
            res = Math.max(curMax, res);
            curMax = (curMax<0) ? 0: curMax;
        }
        return res;
    }
}

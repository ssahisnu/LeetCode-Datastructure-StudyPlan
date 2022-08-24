class Solution {
    //Q-exactly one solution
    //BCR - {O(NLogN), O(1), sort and 2 ptr approach}, {O(N), O(N), HashMap and 1 pass}
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsToIndMap = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; ++i) {
            if (numsToIndMap.containsKey(target-nums[i])){
                res[0] = numsToIndMap.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            numsToIndMap.put(nums[i], i);
        }
        
        return res;
    }
}

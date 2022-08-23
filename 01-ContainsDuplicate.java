class Solution {
    //TC:O(N)
    //SC:O(N)
    //BCR - {O(NLogN); O(1); sorting}; current
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(
            Arrays.stream(nums)
            .boxed()          //boxed wraps Integer over the primitive int
            .collect(Collectors.toList()));
        return set.size() != nums.length;
    }
}

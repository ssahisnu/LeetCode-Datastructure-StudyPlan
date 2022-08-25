class Solution {
    //TC - O(N) 
    //SC - O(1000) {0 <= nums1[i], nums2[i] <= 1000}
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,int[]> numToCountMap = new HashMap<>();
        int iter1=0;
        int iter2=0;
        while(iter1<nums1.length || iter2<nums2.length) {
            if(iter1<nums1.length) {
                numToCountMap.putIfAbsent(nums1[iter1], new int[]{0,0});
                numToCountMap.get(nums1[iter1++])[0]++;
            }
            if(iter2<nums2.length) {
                numToCountMap.putIfAbsent(nums2[iter2], new int[]{0,0});
                numToCountMap.get(nums2[iter2++])[1]++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int key: numToCountMap.keySet()){
            int[] ctn = numToCountMap.get(key);
            if(ctn[0]>0 && ctn[1]>0){
                for(int i=0; i<Math.min(ctn[0], ctn[1]); ++i) res.add(key);
            }
        }
        int[] resArr = new int[res.size()];
        for(int i=0; i<res.size() ; ++i){
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}

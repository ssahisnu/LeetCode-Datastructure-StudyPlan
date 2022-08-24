class Solution {
    //TC - O(N)
    //SC - O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = nums1.length-nums2.length-1;
        int l2 = nums2.length-1;
        
        int iter = nums1.length-1;
        
        while(l1>=0 && l2>=0) {
            if(nums1[l1]>nums2[l2]) {
                nums1[iter--] = nums1[l1--];
            } else {
                nums1[iter--] = nums2[l2--];
            }
        }
        
        while(l2>=0){
            nums1[iter--] = nums2[l2--];
        }
        return;
    }
}

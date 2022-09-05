class Solution {
    //TC - O(N)
    //SC - O(N)
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int l=0;
        int r=list.size()-1;
        while(l<r){
            int sum = list.get(l) + list.get(r);
            if(sum==k) return true;
            else if(sum<k) ++l;
            else r--;
        }
        return false;
    }
    private void inOrder(TreeNode root, List<Integer> lis){
        if(root==null)
            return;
        inOrder(root.left, lis);
        lis.add(root.val);
        inOrder(root.right, lis);
    }
}

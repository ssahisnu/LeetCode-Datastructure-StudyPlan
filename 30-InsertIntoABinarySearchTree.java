class Solution {
    //TC - O(H)/O(N)
    //SC - O(1)
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode prev = root;
        TreeNode cur = root;
        while(root!=null) {
            prev=root;
            if(root.val>val)
                root = root.left;
            else
                root = root.right;
        }
        if(prev==null)
            return new TreeNode(val);
        if(prev.val<val)
            prev.right = new TreeNode(val);
        else
            prev.left = new TreeNode(val);
        
        return cur;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //BST 
        // BCR - O(H) and not O(N) like BT
        
        // root is smaller than both p and q -> go root.right
        // root is greater than both p and q -> go root.left
        
        // if root is greater than one(p,q) and smaller than other(p,q)
        if(root==null) return root;
        if((root.val<p.val && root.val>q.val) ||
           (root.val>p.val && root.val<q.val) || 
          (root.val==p.val) || (root.val==q.val)){
            return root;
        }
        if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right, p, q);
        } else{
            return lowestCommonAncestor(root.left, p, q);
        }
    }
}

class Solution {
    //TC - O(N)
    //SC - O(N) recursion stack - skewed tree
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preO(root, res);
        return res;
    }
    
    private void preO(TreeNode node, List<Integer> res){
        if(node==null) return;
        res.add(node.val);
        preO(node.left, res);
        preO(node.right, res);
    }
}

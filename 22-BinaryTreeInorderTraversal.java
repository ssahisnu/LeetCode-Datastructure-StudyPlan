class Solution {
    //TC - O(N)
    //SC - O(N) recursion stack - skewed tree
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inO(root, res);
        return res;
    }
    
    private void inO(TreeNode node, List<Integer> res){
        if(node==null) return;
        
        inO(node.left, res);
        res.add(node.val);        
        inO(node.right, res);
    }
}

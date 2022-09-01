class Solution {
    //TC - O(N)
    //SC - O(N) recursion stack - skewed tree
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postO(root, res);
        return res;
    }
    
    private void postO(TreeNode node, List<Integer> res){
        if(node==null) return;
        
        postO(node.left, res);       
        postO(node.right, res);
        res.add(node.val); 
    }
}

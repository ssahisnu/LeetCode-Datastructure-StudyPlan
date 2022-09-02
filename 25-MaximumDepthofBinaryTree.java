class Solution {
    //TC -O(N)
    //SC - O(N)
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
    
    private int dfs(TreeNode node) {
        
        if(node == null)
            return 0;
        return 1 + Math.max(dfs(node.left), dfs(node.right));
    }
}

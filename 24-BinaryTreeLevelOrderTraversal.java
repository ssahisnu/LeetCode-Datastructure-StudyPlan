class Solution {
    //TC - O(N)
    //SC - O(N)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int sz = q.size();
            List<Integer> lvlList = new ArrayList<>(sz);
            for(int i=0; i<sz; ++i){
                TreeNode cur = q.poll();
                lvlList.add(cur.val);
                if(cur.left!=null)
                    q.offer(cur.left);
                if(cur.right!=null)
                    q.offer(cur.right);
            }
            res.add(lvlList);
        }
        return res;
    }
}

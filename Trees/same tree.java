/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
…    static boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null ) return false;
        if (q == null) return false;
        return (p.val == q.val && (dfs(p.left, q.left) && dfs(p.right, q.right)));
    }
}

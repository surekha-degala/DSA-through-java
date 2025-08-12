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
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return isb(root);
    }
    public static int dfs(TreeNode root) {
        if (root == null) return 0;
        return 1+ Math.max(dfs(root.left), dfs(root.right));
    }
    static boolean isb(TreeNode root) {
        if (root == null) return true;

        int lh = dfs(root.left);
        int rh = dfs(root.right);
        if (Math.abs(lh-rh) <= 1&& isb(root.left) && isb(root.right)) return true;
        else return false;
    }
}

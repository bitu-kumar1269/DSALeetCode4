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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }

        dfs(root, targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        
        return count;
    }
    public void dfs(TreeNode node, long target){
        if(node == null){
            return ;
        }

        target -= node.val;

        if(target == 0){
            count++;
        }

        dfs(node.left, target);
        dfs(node.right, target);
    }
}
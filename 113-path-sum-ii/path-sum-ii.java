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
    private void dfs(TreeNode root, int currentSum, int targetSum, List<Integer> currentPath, List<List<Integer>> res) {
        if (root == null) {
            return;
        }

        // Add the current node's value
        currentSum += root.val;
        currentPath.add(root.val);

        // If it's a leaf node and matches targetSum, record a copy of the path
        if (root.left == null && root.right == null) {
            if (currentSum == targetSum) {
                res.add(new ArrayList<>(currentPath));
            }
        } else {
            dfs(root.left, currentSum, targetSum, currentPath, res);
            dfs(root.right, currentSum, targetSum, currentPath, res);
        }

        // Backtrack: remove the current node before returning up the call stack
        currentPath.remove(currentPath.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        dfs(root, 0, targetSum, currentPath, res);
        return res;
    }
}
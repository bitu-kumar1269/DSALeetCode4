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
    public int nodeCount = 0;
    public int averageOfSubtree(TreeNode root) {
        nodeCount = 0;
        postOrder(root);

        return nodeCount;
    }
    private int[] postOrder(TreeNode node){
        if(node == null){
            return new int[] {0,0};
        }

        int left[] = postOrder(node.left);
        int right[] = postOrder(node.right);

        int currSum = left[0] + right[0] + node.val;
        int currCount = left[1] + right[1] +1;

        if(currSum / currCount == node.val){
            nodeCount++;
        }
        return new int[]{currSum, currCount};
    }
}
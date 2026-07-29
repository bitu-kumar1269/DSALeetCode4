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
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int currlevel = 1;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            int levelSum = 0;

            for(int i=0; i<levelSize; i++){
                TreeNode temp = q.poll();
                levelSum += temp.val;
            
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            if(levelSum > maxSum){
                maxSum = levelSum;
                maxLevel = currlevel;
            }
            currlevel++;
        }
        // System.out.print(maxSum);
        return maxLevel;        
    }
}
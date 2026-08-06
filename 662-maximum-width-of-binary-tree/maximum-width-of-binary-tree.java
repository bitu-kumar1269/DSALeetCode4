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
    class Node {
        TreeNode node;
        int idx;
        Node(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxWidth = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 0));

        while(!q.isEmpty()){
            int len = q.size();
            int minIndex = q.peek().idx; // Store the minimum index at the current level
            int first = 0, last = 0;

            for(int i=0; i<len; i++){
                Node temp = q.poll();
                int index = temp.idx - minIndex;

                if(i == 0) first = index;
                if(i == len -1) last = index;

                if(temp.node.left != null){
                    q.add(new Node(temp.node.left, 2 * index +1));
                }
                if(temp.node.right != null){
                    q.add(new Node(temp.node.right, 2 * index +2));
                }
                maxWidth = Math.max(maxWidth, last - first +1);
            }
        }
        return maxWidth;
    }
}
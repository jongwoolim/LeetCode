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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int sum = 0;
        while(!queue.isEmpty()){

            int qSize = queue.size();
            sum = 0;

            for(int i=0; i< qSize; i++){
                TreeNode visitedNode = queue.poll();
                sum += visitedNode.val;

                if(visitedNode.left != null){
                    queue.offer(visitedNode.left);
                }

                if(visitedNode.right != null){
                    queue.offer(visitedNode.right);
                }
            }
        }

        return sum;
    }
}
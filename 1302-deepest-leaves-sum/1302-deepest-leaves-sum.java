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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){

            int qSize = queue.size();
            int depth = 1;
            int sum = 0;
            
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
            
            depth++;
            map.put(depth, sum);
        }
        
        return map.firstEntry().getValue(); 
    }
}
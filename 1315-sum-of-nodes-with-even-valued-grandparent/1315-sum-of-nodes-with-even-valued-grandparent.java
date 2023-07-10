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
    public int sumEvenGrandparent(TreeNode root) {
        int answer = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            TreeNode currentNode = queue.poll();

            if(currentNode.val % 2 == 0){
                if(currentNode.left != null){
                    if(currentNode.left.left != null){
                        answer += currentNode.left.left.val;
                    }

                    if(currentNode.left.right!= null){
                        answer += currentNode.left.right.val;
                    }

                }

                if(currentNode.right != null){
                    if(currentNode.right.left != null){
                        answer += currentNode.right.left.val;
                    }
                    
                    if(currentNode.right.right != null){
                        answer += currentNode.right.right.val;
                    }
                }
            }

            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }

            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }

        return answer;
    }
}
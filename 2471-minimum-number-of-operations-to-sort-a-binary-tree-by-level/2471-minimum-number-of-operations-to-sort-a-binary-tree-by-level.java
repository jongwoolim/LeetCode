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

    int answer;

    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int qSize = q.size();
            int[] arr = new int[qSize];

            for(int i=0; i< qSize; i++){
                TreeNode node = q.poll();

                arr[i] = node.val;

                if(node.left != null){
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }
            }

            int len = arr.length;

            for(int i =0; i<len - 1; i++){
                int idx = i;

                for(int j = i + 1; j< len; j++){
                    if(arr[j] < arr[idx]){
                        idx = j;
                    }
                }

                if(arr[i] > arr[idx]){
                    int tmp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = tmp;

                    answer++;    
                }
            }
        }

        return answer;
    }
}
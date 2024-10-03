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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        helperpostorder(root, traversal);
        return traversal;

    }
    private void helperpostorder(TreeNode root , List<Integer> traversal){
        if(root==null){
            return;
        }
        helperpostorder(root.left , traversal);
        helperpostorder(root.right , traversal);
        traversal.add(root.val);
    }
}
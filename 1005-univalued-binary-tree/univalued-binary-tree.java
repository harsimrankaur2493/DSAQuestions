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

    public void inorder(TreeNode root , List<Integer> Traversal){
        if(root==null){
            return ;
        }
        inorder(root.left , Traversal);
        Traversal.add(root.val);
        inorder(root.right , Traversal);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }

        List<Integer> Traversal = new ArrayList<>();
        inorder(root, Traversal);
        for(int i=0;i<Traversal.size();i++){
            if(Traversal.get(i) != root.val){
                return false;
            }
        }
        return true;
    }
}
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
class Solution 
{
    public void invert(TreeNode root)
    {
        TreeNode temp=root;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        
    }
    public TreeNode invertTree(TreeNode root)
    {
        if(root!=null)
        {
            invert(root);
           if(root.left!=null)
            invertTree(root.left);
           if(root.right!=null)
            invertTree(root.right);
        }
        return root;
           
    }
}

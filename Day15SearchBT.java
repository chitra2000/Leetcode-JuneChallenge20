
class Solution 
{    
    public TreeNode searchBST(TreeNode root, int val)
    {
        final TreeNode temp=root;
        if(root==null)
            return temp;
        else if(root.val==val)
            return root;
        else if(root.val>val)
            return searchBST(root.left,val);
        else 
            return searchBST(root.right,val);     
    }
}
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

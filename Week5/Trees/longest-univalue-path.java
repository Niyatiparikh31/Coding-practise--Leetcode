/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int x = 0;
    public int longestUnivaluePath(TreeNode root) {
        
        helper(root);
        return x;
        
    }
    
    public int helper(TreeNode root)
    {
        int y=0,z=0;
        if(root==null) return 0;
        else{
            
            int left = helper(root.left);
            int right = helper(root.right);
       
            if( root.left!=null && root.left.val==root.val)
                y += 1+left;
            if(root.right!=null && root.right.val==root.val)
                z += 1+right;
        }
        x=Math.max(x,y+z);
        return Math.max(y,z);
        
    }
}
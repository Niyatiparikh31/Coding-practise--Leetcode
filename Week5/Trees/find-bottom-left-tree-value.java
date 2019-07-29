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
    int md = 0;
    int LValue=0;
    public int findBottomLeftValue(TreeNode root) {
        
        helper(root, 1);
        return LValue;
    }
    
    public void helper(TreeNode root, int currLevel)
    {
        if(currLevel> md)
        {
            LValue = root.val;
            md++;
        }
        
        if(root.left!=null)
        {
            helper(root.left, currLevel+1);
        }
        
        if(root.right!=null)
        {
            helper(root.right, currLevel+1);
        }
        
    }
    
    
    
}
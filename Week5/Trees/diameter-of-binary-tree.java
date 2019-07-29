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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root!=null){
            int leftSize = maxDepth(root.left);
            int rightSize = maxDepth(root.right);
            max = Math.max(max,leftSize+rightSize);

            diameterOfBinaryTree(root.right);
            diameterOfBinaryTree(root.left);
        }
        
        return max;
    }

    public int maxDepth(TreeNode root) {
        int md= 0;
        
        if(root!=null)
        {
            if(root.right==null && root.left==null)
            {
                return 1;
            }
            md= Math.max(md, 1+maxDepth(root.left));
            md= Math.max(md, 1+maxDepth(root.right));
            
        }
        
        return md;
    }
}
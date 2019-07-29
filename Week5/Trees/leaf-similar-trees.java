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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
      
        ArrayList<Integer> leaf1nodes = new ArrayList<Integer>();
        ArrayList<Integer> leaf2nodes = new ArrayList<Integer>();
        
        findChild(root1, leaf1nodes);
        findChild(root2, leaf2nodes);
       
        return leaf1nodes.equals(leaf2nodes);
    }
    
    
    public void findChild(TreeNode rootNode, List<Integer> abc)
    {
    if(rootNode!=null){
        
        if(rootNode.left==null && rootNode.right==null)
        {
            abc.add(rootNode.val);
            
        }
        findChild(rootNode.left,abc);
        findChild(rootNode.right,abc);
            

        
    }
        
    }
}
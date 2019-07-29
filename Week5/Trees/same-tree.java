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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        ArrayList<Integer> leaf1nodes = new ArrayList<Integer>();
        ArrayList<Integer> leaf2nodes = new ArrayList<Integer>();
        
        findChild(p, leaf1nodes);
        findChild(q, leaf2nodes);
       
        return leaf1nodes.equals(leaf2nodes);

        
    }
    
    public void findChild(TreeNode rootNode, List<Integer> abc)
    {
    if(rootNode!=null){
        abc.add(rootNode.val);
        
        findChild(rootNode.left,abc);
        findChild(rootNode.right,abc);
       
    }
        else 
            abc.add(null);
        
    }
}
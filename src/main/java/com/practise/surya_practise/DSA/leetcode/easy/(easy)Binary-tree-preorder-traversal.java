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
    List<Integer> arr;
    public void rec(TreeNode node)
    {
        if(node==null)
            return ;
        //root, leftSubtree, rightSubtree
        arr.add(node.val);
        rec(node.left);
        rec(node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        arr=new ArrayList<>();
        rec(root);
        return arr;
    }
}

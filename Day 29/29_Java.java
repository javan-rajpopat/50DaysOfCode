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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ans=root;
        while (root!=null){
            if(root.val < val){
                if(root.right == null){
                    root.right = new TreeNode(val);
                    return ans;
                }else{
                    root=root.right;
                }
            }else{
                if(root.left == null){
                    root.left = new TreeNode(val);
                    return ans;
                }else{
                    root = root.left;
                }
            }
        }
        return ans;
    }
}
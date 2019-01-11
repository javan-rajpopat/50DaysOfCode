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
    public int def(TreeNode root, int L, int R){
            int s=0;
            if(root!=null){
                if(root.val>=L && root.val<=R){
                    s+=root.val;
                }
            }
            if(root.right!=null){
                s+=def(root.right, L , R);
            }
            if(root.left!=null){
                s+=def(root.left, L, R);
            }
            return s;
        }
    public int rangeSumBST(TreeNode root, int L, int R) {
        int s;
        s=def(root, L , R);
        return s;
    }
}
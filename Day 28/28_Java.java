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
    public String kid(TreeNode t) {
        String s="(";
        s += Integer.toString(t.val);
        if ((t.left==null) && (t.right==null)){
            s+="";
        }else{
            if(t.left != null){
                s+=kid(t.left);
            }else{
                s+="()";
            }
            if(t.right != null){
                s+=kid(t.right);
            }
        }
        return s+")";
    }
    public String tree2str(TreeNode t) {
        String s="";
        if (t==null){
            return s;
        }else{
            s+= kid(t);
            return s.substring(1,s.length()-1);
        }
    }
}




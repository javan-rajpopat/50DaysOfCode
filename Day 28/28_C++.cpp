/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    string kid(TreeNode* t) {
        string s="(";
        s+= to_string(t -> val);
        if ((t -> left==NULL) && (t -> right == NULL)){
            s+="";
        }else{
            if (t -> left != NULL){
                s+=kid(t->left);
            }else{
                s+="()";
            }
            if (t -> right != NULL){
                s+=kid(t -> right);
            }
        }
        return s+")";
    }
    string tree2str(TreeNode* t) {
        string s="";
        if (t==NULL){
            return s;
        }
        s += kid(t);
        return s.substr (1,s.length()-2);
    }
};





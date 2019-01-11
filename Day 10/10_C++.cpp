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
    void def(TreeNode* root,int &s, int L, int R){
            if(root!=NULL){
                if(root->val>=L && root->val<=R){
                    s+=root->val;
                }
            }
            if(root->right!=NULL){
                def(root->right,s, L , R);
            }
            if(root->left!=NULL){
                def(root->left,s, L, R);
            }
        }
    int rangeSumBST(TreeNode* root, int L, int R) {
        int s=0;
        def(root,s, L , R);
        return s;
    }
};

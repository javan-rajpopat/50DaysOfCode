/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        if (head==NULL || head->next==NULL){
            return head;
        }
        ListNode *ans=head;
        int temp;
        while (head!=NULL){
            if (head->next != NULL){
                temp=head->val;
                head->val=(head->next)->val;
                (head->next)->val=temp;
                #cout<<(head->next)->val<<"\t"<<head->val;
                #cout<<"\n";
                head=(head->next)->next;
            }else{
                return ans;
            }
        }
        return ans;
    }
};


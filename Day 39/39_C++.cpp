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
    void reorderList(ListNode* head) {
        ListNode* temp;
        vector<int> l;
        temp=head;
        while (temp!=NULL){
            l.push_back(temp->val);
            temp=temp->next;
        }
        int flip=1;
        while (head!=NULL){
            if (flip==1){
                head->val=l[0];
                l.erase(l.begin());
            }
            else{
                head->val=l[l.size()-1];
                l.erase(l.end()-1);
            }
            head = head -> next;
            flip*=-1;
        }
    }
};



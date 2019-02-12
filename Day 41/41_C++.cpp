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
    ListNode* oddEvenList(ListNode* head) {
        ListNode* ans=head;
        ListNode* copy=head;
        int flip=1,x=0;
        vector<int> o,e,c;
        while (head!=NULL){
            if (flip==1){
                o.push_back(head->val);
            }else{
                e.push_back(head->val);
            }
            head=head->next;
            flip*=-1;
        }
        c.reserve( o.size() + e.size() ); 
        c.insert( c.end(), o.begin(), o.end() );
        c.insert( c.end(), e.begin(), e.end() );
        while (copy!=NULL){
            copy->val=c[x];
            copy=copy->next;
            x++;
        }
        return ans;
    }
};


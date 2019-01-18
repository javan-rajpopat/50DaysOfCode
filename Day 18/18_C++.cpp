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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head->next==NULL){
            return NULL;
        }
        ListNode *ans=head;
        ListNode *code=head;
        int count=0;
        while (code!=NULL){
            code=code->next;
            count+=1;
        }
        count=count-n;
        while (head!=NULL){
            if (count==0){
                ans=head->next;
                return ans;
            }else if(count==1 && (head->next)->next==NULL){
                head->next=NULL;
                return ans;
            }else if(count==1 && (head->next)==NULL){
                head=NULL;
                return ans;
            }else if(count==1){
                head->next=(head->next)->next;
                return ans;
            }
            head=head->next;
            count--;
        }
        return ans;
    }
};



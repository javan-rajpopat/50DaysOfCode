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
    ListNode* middleNode(ListNode* head) {
        ListNode* copy=head;
        int count=0,c=1;
        while (copy!=NULL){
            copy=copy->next;
            count++;
        }
        count = (int)count/2;
        while (c<=count){
            head = head->next;
            c++;
        }
        return head;
    }
};


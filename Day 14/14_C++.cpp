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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        long long int num1=0,count=1,tmp,num2=0;
        while (l1!=NULL){
            tmp=l1->val;
            num1=num1+(tmp*count);
            count=count*10;
            l1=l1->next;
        }
        count=1;
        while (l2!=NULL){
            tmp=l2->val;
            num2=num2+(tmp*count);
            count=count*10;
            l2=l2->next;
        }
        long long int num=0;
        num=num1+num2;
        string ans;
        ans=to_string(num);
        reverse(ans.rbegin(), ans.rend());
        tmp=(int)ans[0]-48;
        ListNode *l3 = new ListNode(tmp);
        ListNode *rr;
        rr=l3;
        for(int i=1;i<ans.length();i++){
            tmp=(int)ans[i]-48;
            l3->next=new ListNode(tmp);
            l3=l3->next;
        }
        return (rr);
    }
};
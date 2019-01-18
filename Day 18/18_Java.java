/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null){
            return null;
        }
        ListNode ans=head;
        ListNode code=head;
        int count=0;
        while (code!=null){
            code=code.next;
            count+=1;
        }
        count=count-n;
        while (head!=null){
            if (count==0){
                ans=head.next;
                return ans;
            }else if(count==1 && (head.next).next==null){
                head.next=null;
                return ans;
            }else if(count==1 && (head.next)==null){
                head=null;
                return ans;
            }else if(count==1){
                head.next=(head.next).next;
                return ans;
            }
            head=head.next;
            count--;
        }
        return ans;
    }
}
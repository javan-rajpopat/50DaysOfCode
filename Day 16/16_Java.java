/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode ans=head;
        int temp;
        while (head!=null){
            if (head.next != null){
                temp=head.val;
                head.val=(head.next).val;
                (head.next).val=temp;
                head=(head.next).next;
            }else{
                return ans;
            }
        }
        return ans;
    }
}


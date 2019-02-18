/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode copy=head;
        int count=0,c=1;
        while (copy!=null){
            copy=copy.next;
            count++;
        }
        count = (int)count/2;
        while (c<=count){
            head = head.next;
            c++;
        }
        return head;
    }
}
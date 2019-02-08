/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        List<Integer> l = new ArrayList();
        ListNode temp;
        temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        int flip=1;
        while(head!=null){
            if (flip==1){
                head.val=l.get(0);
                l.remove(0);
            }else{
                head.val=l.get(l.size()-1);
                l.remove(l.size()-1);
            }
            flip*=-1;
            head = head.next;
        }
    }
}


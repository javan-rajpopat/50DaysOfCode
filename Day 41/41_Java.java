/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode ans=head;
        ListNode copy=head;
        int flip=1,x=0;
        List<Integer> o = new ArrayList();
        List<Integer> e = new ArrayList();
        List<Integer> c = new ArrayList();
        while (head!=null){
            if (flip==1){
                o.add(head.val);
            }else{
                e.add(head.val);
            }
            head=head.next;
            flip*=-1;
        }
        c=Stream.concat(o.stream(), e.stream()).collect(Collectors.toList());
        while (copy!=null){
            copy.val=c.get(x);
            copy=copy.next;
            x++;
        }
        return ans;
    }
}




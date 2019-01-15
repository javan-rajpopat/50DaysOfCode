/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0,count=1,tmp,num2=0;
        while (l1!=null){
            tmp = l1.val;
            num1=num1+(tmp*count);
            count=count*10;
            l1=l1.next;
        }
        count=1;
        while (l2!=null){
            tmp=l2.val;
            num2=num2+(tmp*count);
            count=count*10;
            l2=l2.next;
        }
        int num=0;
        num=num1+num2;
        String ans;
        ans=Long.toString(num);
        char[] tr = ans.toCharArray();
        int c=0;
        char o;
        for (int j = ans.length()-1; j>=0; j--,c++) 
        {    
            o=ans.charAt(j);
            tr[c]=o;
        }
        tmp=(int)tr[0]-48;
        ListNode l3 = new ListNode(tmp);
        ListNode rr=l3;
        for(int i=1;i<tr.length;i++){
            tmp=(int)tr[i]-48;
            l3.next = new ListNode(tmp);
            l3 = l3.next;
        }
        return (rr);
    }
}
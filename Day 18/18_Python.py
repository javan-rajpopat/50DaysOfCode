# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if head.next==None:
            return None
        ans=head
        code=head
        count=0
        while code!=None:
            code=code.next
            count+=1
        count=count-n
        while head!=None:
            if count==0:
                ans=head.next
                return ans
            elif count==1 and (head.next).next==None:
                head.next=None
                return ans
            elif count==1 and head.next==None:
                head=None
                return ans
            elif count==1:
                head.next=(head.next).next
                return ans
            head=head.next
            count-=1
        

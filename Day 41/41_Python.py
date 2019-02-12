# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        ans=head
        copy=head
        flip=1
        o=[]
        e=[]
        while head!=None:
            if flip==1:
                o.append(head.val)
            if flip==-1:
                e.append(head.val)
            head=head.next
            flip*=-1
        c=o+e
        x=0
        while copy!=None:
            copy.val=c[x]
            copy=copy.next
            x+=1
        return ans
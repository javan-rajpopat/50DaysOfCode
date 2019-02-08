# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reorderList(self, head: 'ListNode') -> 'None':
        """
        Do not return anything, modify head in-place instead.
        """
        temp=head
        l=[]
        while temp!=None:
            l.append(temp.val)
            temp=temp.next
        flip=1
        while head!=None:
            if flip==1:
                head.val=l[0]
                del l[0]
            else:
                head.val=l[-1]
                del l[-1]
            head=head.next
            flip*=-1
        
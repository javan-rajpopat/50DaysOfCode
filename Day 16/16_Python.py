# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None:
            return head
        elif head.next == None:
            return head
        ans=head
        while head != None:
            if head.next != None:
                temp=head.val
                head.val=(head.next).val
                (head.next).val=temp
                head=(head.next).next
            else:
                return ans
        return ans
        
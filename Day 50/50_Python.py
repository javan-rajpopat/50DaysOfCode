# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def middleNode(self, head: 'ListNode') -> 'ListNode':
        copy1=head
        count=0
        while copy1!=None:
            #print(copy1.val)
            copy1=copy1.next
            count+=1
        count = math.floor(count/2)
        c=1
        while c<=count:
            head=head.next
            c+=1
        
        return head
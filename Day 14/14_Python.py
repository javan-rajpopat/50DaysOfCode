# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        num1=0
        count=1
        while l1!=None:
            tmp=l1.val
            num1=num1+(tmp*count)
            count=count*10
            l1=l1.next
        num2=0
        count=1
        while l2!=None:
            tmp=l2.val
            num2=num2+(tmp*count)
            count*=10
            l2=l2.next
        num=num1+num2
        ans=str(num)
        ans=ans[::-1]
        l3=ListNode(ans[0])
        rr=l3
        for x in range(1,len(str(num))):
            tmp=ListNode(ans[x])
            l3.next=tmp
            l3=l3.next
        return rr
        
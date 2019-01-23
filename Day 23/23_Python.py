class Solution:
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        a=set()
        l=[]
        for n in nums:
            if n in a:
                l.append(n)
            else:
                a.add(n)
        return l
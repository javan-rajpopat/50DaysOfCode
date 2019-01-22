class Solution:
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count=1
        while count in nums:
            count+=1
        return count
        
        
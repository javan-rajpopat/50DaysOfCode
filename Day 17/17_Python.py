class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0:
            return 0
        elif len(nums)==1:
            return 1
        i=0
        while i<len(nums)-1:
            if nums[i]==nums[i+1]:
                nums.pop(i+1)
                i-=1
            i+=1
        return len(nums)
        
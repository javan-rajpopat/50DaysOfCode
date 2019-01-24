class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n=0
        while n<len(nums):
            m=n+1
            while m<len(nums):
                if n!=m:
                    if (nums[n]+nums[m])==target:
                        return n,m
                m+=1
            n+=1

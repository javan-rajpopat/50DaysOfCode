class Solution(object):
    def removeDuplicates(self, nums):
        n=0
        count=0
        while n<len(nums)-2:
            if nums[n]==nums[n+1]:
                if nums[n]==nums[n+2]:
                    temp=nums[n]
                    nums.remove(temp)
                    count+=1
                    n-=1
            n+=1
        return len(nums)
        
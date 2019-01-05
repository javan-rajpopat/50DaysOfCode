class Solution(object):
    def dominantIndex(self, nums):
        if len(nums)==0:
            return -1
        elif len(nums)==1:
            return 0
        max1=0
        max2=0
        n=-1
        for i in range(len(nums)):
            if nums[i]>=max1:
                max2=max1
                max1=nums[i]
                n=i
            elif nums[i]>=max2:
                max2=nums[i]
        if max1>=2*max2:
            return n
        return -1
        

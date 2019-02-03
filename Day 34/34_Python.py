class Solution:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if nums==[]:
            return -1
        mn=min(nums)
        if target<=mn:
            if target==mn:
                return nums.index(mn)
            else:
                return -1
        mx=max(nums)
        if target>=nums[0]:
            iterator=0
            while iterator<=nums.index(mx):
                if nums[iterator]==target:
                    return iterator
                iterator+=1
            return -1
        else:
            iterator=nums.index(mn)
            while iterator<len(nums):
                if nums[iterator]==target:
                    return iterator
                iterator+=1
            return -1
        
        
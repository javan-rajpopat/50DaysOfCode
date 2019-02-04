class Solution:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if nums==[]:
            return False
        mn=min(nums)
        if target<=mn:
            if target==mn:
                return True
            else:
                return False
        mx=max(nums)
        if target>=nums[0]:
            iterator=0
            while iterator<=nums.index(mx):
                if nums[iterator]==target:
                    return True
                iterator+=1
            return False
        else:
            iterator=nums.index(mn)
            while iterator<len(nums):
                if nums[iterator]==target:
                    return True
                iterator+=1
            return False
        
class Solution(object):
    def minMoves2(self, nums):
        count = 0
        s = sorted(nums)
        m = (len(s)/2)
        for n in nums:
            count+=abs(n-s[m])
        return count
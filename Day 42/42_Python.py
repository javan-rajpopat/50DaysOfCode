class Solution:
    def findMaxConsecutiveOnes(self, nums: 'List[int]') -> 'int':
        if nums==[]:
            return 0
        count=0
        m=0
        for x in nums:
            if x==1:
                count+=1
            else:
                if count!=0:
                    if count>m:
                        m=count
                    count=0
        if count!=0 and count>m:
            m=count
        return m
            
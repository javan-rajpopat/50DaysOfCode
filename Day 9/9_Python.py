class Solution:
    def numJewelsInStones(self, J, S):
        count = 0
        for s in S:
            if s in J:
                count+=1
        return count
        
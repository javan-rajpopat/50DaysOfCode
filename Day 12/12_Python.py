class Solution(object):
    def repeatedNTimes(self, A):
        B=[]
        for a in A:
            if a in B:
                return a
            else:
                B.append(a)
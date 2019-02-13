class Solution:
    def smallestRangeI(self, A: 'List[int]', K: 'int') -> 'int':
        t1=min(A)
        t2=max(A)
        if t1+K>=t2-K:
            return 0
        return abs((t1+K)-(t2-K)) 
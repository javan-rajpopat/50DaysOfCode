s=0
class Solution:
    def fib(self, N):
        """
        :type N: int
        :rtype: int
        """
        def f(N):
            global s
            if N==1:
                s+=1
            elif N==0:
                s+=0
            else:
                f(N-1)
                f(N-2)
            return s
        d=f(N)
        return d
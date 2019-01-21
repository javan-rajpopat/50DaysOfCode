class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x>=0:
            st=str(x)
            st=st[::-1]
            ans=int(st)
        else:
            x*=-1
            st=str(x)
            st=st[::-1]
            st='-'+ st
            ans=int(st)
        if ans>(pow(2,31)-1) or ans<pow(-2,31):
            return 0
        return ans
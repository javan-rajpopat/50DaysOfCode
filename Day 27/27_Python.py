class Solution:
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        l1=[]
        l2=[]
        for s in S:
            if s == '#':
                if l1!=[]:
                    l1.pop()
            else:
                l1.append(s)
        for s in T:
            if s == '#':
                if l2!=[]:
                    l2.pop()
            else:
                l2.append(s)
        if l2==l1:
            return True
        else:
            return False
class Solution(object):
    def complexNumberMultiply(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        n11=""
        n12=""
        n21=""
        n22=""
        flag=0
        for aa in a:
            if aa=='i':
                flag=1
            elif aa!='+' and flag==0:
                n11+=aa
            elif aa!='+' and flag==1:
                n12+=aa
            elif aa=='+':
                flag=1
        flag=0
        for bb in b:
            if bb=='i':
                flag=1
            elif bb!='+' and flag==0:
                n21+=bb
            elif bb!='+' and flag==1:
                n22+=bb
            elif bb=='+':
                flag=1
        n11=int(n11)
        n12=int(n12)
        n21=int(n21)
        n22=int(n22)
        n1=n11*n21
        n2=n11*n22
        n3=n12*n21
        n4=n12*n22*-1
        n2=n2+n3
        n1=n1+n4
        output=""
        output=str(n1)+'+'+str(n2)+'i'
        return output
        
            
        
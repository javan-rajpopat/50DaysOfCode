class Solution(object):
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        check=[]
        ans=[]
        output=[]
        for x in range(len(S)):
            if S[x]==C:
                check.append(x)
        for x in range(len(S)):
            for y in range(len(check)):
                ans.append(abs(check[y]-x))
            output.append(min(ans))
            ans=[]
        return output
        
        
     
        
        

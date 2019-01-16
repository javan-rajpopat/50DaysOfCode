class Solution:
    def customSortString(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: str
        """
        count=1
        dic={}
        l=[]
        for s in S:
            dic[s]=count
            count+=1
        for t in T:
            if t not in dic:
                dic[t]=0
        for t in T:
            l.append(t)
        t=0
        while t<len(l):
            i=t+1
            while i<len(l):
                if dic[l[t]]>dic[l[i]]:
                    temp=l[t]
                    l[t]=l[i]
                    l[i]=temp
                i+=1
            t+=1
        makeitastring = ''.join(map(str, l))
        return makeitastring
            
            
                
                
                
class Solution:
    def longestMountain(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        m=0
        hp=0
        for a in range(len(A)-2):
            if A[a]<A[a+1]:
                temp=a+1
                count=1
                while temp<len(A)-1:
                    if A[temp]>=A[temp+1]:
                        hp=1
                        if A[temp]==A[temp+1]:
                            temp=len(A)+5
                            count=-1
                            break
                        temp+=1
                        count+=1
                        break
                    else:
                        count+=1
                    temp+=1
                while temp<len(A)-1:
                    if A[temp]<=A[temp+1]:
                        count+=1
                        break
                    else:
                        count+=1
                    temp+=1
                if temp==len(A)-1:
                    count+=1
                if count>m and hp==1:
                    m=count
                    hp=0
        return m
                    
            
        
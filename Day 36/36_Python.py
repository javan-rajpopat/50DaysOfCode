class Solution:
    def getRow(self, rowIndex: 'int') -> 'List[int]':
        if rowIndex==0:
            return [1]
        if rowIndex==1:
            return [1,1]
        k=[[1],[1,1]]
        count=2
        while count<=rowIndex:
            c=1
            s=[1]
            while c<count:
                s.append(k[count-1][c-1]+k[count-1][c])
                c+=1
            count+=1
            s.append(1)
            k.append(s)
        return s
            
            
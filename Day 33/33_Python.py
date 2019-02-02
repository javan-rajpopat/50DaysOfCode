class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix==[[]]:
            return False
        x=0
        while x<len(matrix):
            if target>=matrix[x][-1]:
                if target==matrix[x][-1]:
                    return True
                else:
                    x+=1  
            elif target<matrix[x][-1]:
                y=0
                while y<len(matrix[x]):
                    if target==matrix[x][y]:
                        return True
                    y+=1
                x+=1
        return False
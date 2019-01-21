class Solution:
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for x in board:
            mset=[]
            for y in x:
                if y != '.':
                    if y not in mset:
                        mset.append(y)
                    else:
                        return False
        for x in range(9):
            mset=[]
            for y in board:
                if y[x] !='.':
                    if y[x] not in mset:
                        mset.append(y[x])
                    else:
                        return False
        for x in [[0,1,2],[3,4,5],[6,7,8]]:
            mset1=[]
            for a in x:
                for y in [0,1,2]:
                    if board[a][y] != '.':
                        if board[a][y] not in mset1:
                            mset1.append(board[a][y])
                        else:
                            return False
            mset2=[]
            for a in x:
                for y in [3,4,5]:
                    if board[a][y] != '.':
                        if board[a][y] not in mset2:
                            mset2.append(board[a][y])
                        else:
                            return False
            mset3=[]
            for a in x:
                for y in [6,7,8]:
                    if board[a][y] != '.':
                        if board[a][y] not in mset3:
                            mset3.append(board[a][y])
                        else:
                            return False
        return True
        
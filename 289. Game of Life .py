class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        row = len(board)
        col = len(board[0])

        def countN(r, c):
            nei = 0
            for i in range(r - 1, r + 2):
                for j in range(c - 1, c + 2):
                    if i == r and j == c:
                        continue  
                    if 0 <= i < row and 0 <= j < col: 
                        if board[i][j] in [1, 3]:  
                            nei += 1
            return nei

        for r in range(row):
            for c in range(col):  
                nei = countN(r, c)
                if board[r][c] == 1: 
                    if nei in [2, 3]:
                        board[r][c] = 3  
                elif board[r][c] == 0:  
                    if nei == 3:
                        board[r][c] = 2  


        for r in range(row):
            for c in range(col):
                if board[r][c] == 1:
                    board[r][c] = 0  
                elif board[r][c] in [2, 3]:
                    board[r][c] = 1  

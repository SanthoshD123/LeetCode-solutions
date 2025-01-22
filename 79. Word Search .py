class Solution:
    def exist(self, board, word):
        rows, cols = len(board), len(board[0])

        def backtrack(r, c, index):
            if index == len(word):
                return True
            if r < 0 or r >= rows or c < 0 or c >= cols or board[r][c] != word[index]:
                return False
            temp = board[r][c]
            board[r][c] = "#"
            for dr, dc in [(0, 1), (1, 0), (0, -1), (-1, 0)]:
                if backtrack(r + dr, c + dc, index + 1):
                    return True
            board[r][c] = temp
            return False

        for i in range(rows):
            for j in range(cols):
                if backtrack(i, j, 0):
                    return True
        return False

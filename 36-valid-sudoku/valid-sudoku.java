class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int r, int c, char[][] board) {
        if (board[r][c] == '.') {
            return true;
        }

        char num = board[r][c];

        for (int j = 0; j < 9; j++) {
            if (j != c && board[r][j] == num) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != r && board[i][c] == num) {
                return false;
            }
        }

        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if ((i != r || j != c) && board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
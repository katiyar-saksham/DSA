class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        // gravity
        for (int i = 0; i < m; i++) {
            int empty = n - 1;

            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') { //obstacle
                    empty = j - 1; // yha tkk movt hoga of stone i.e. obstacle se 1 phele tkk
                } else if (boxGrid[i][j] == '#') { //stone
                    char temp = boxGrid[i][empty];
                    boxGrid[i][empty] = '#';
                    boxGrid[i][j] = temp;
                    empty--;
                }
            }
        }

        // rotate
        char[][] res = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return res;
    }
}
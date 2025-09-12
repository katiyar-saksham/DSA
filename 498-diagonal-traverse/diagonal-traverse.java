class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int i = 0, j = 0, idx = 0;
        boolean isUp = true;

        while (idx < m * n) {
            res[idx++] = mat[i][j];

            if (isUp) { // moving up-right
                if (j == n - 1) {      // Hit right boundary
                    i++;
                    isUp = false;
                } else if (i == 0) {  // Hit top boundary
                    j++;
                    isUp = false;
                } else {
                    i--;
                    j++;
                }
            } else { // moving down-left
                if (i == m - 1) {      // Hit bottom boundary
                    j++;
                    isUp = true;
                } else if (j == 0) {  // Hit left boundary
                    i++;
                    isUp = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}

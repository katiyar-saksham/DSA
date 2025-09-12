import java.util.*;

public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {
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

    public static void main(String[] args) {

        int[][] mat = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
}







// class Solution {
//     public int[] findDiagonalOrder(int[][] mat) {
//         if (mat == null || mat.length == 0) return new int[0];

//         int m = mat.length;       // number of rows
//         int n = mat[0].length;    // number of columns
//         int[] result = new int[m * n];
//         int row = 0, col = 0;
//         int d = 1;                // direction: 1 = up, -1 = down

//         for (int i = 0; i < result.length; i++) {
//             result[i] = mat[row][col];

//             if (d == 1) { // moving up
//                 if (col == n - 1) {  // hit right boundary
//                     row++;
//                     d = -1;
//                 } else if (row == 0) { // hit top boundary
//                     col++;
//                     d = -1;
//                 } else {                // move up-right
//                     row--;
//                     col++;
//                 }
//             } else { // moving down
//                 if (row == m - 1) {   // hit bottom boundary
//                     col++;
//                     d = 1;
//                 } else if (col == 0) { // hit left boundary
//                     row++;
//                     d = 1;
//                 } else {                // move down-left
//                     row++;
//                     col--;
//                 }
//             }
//         }

//         return result;
//     }
// }
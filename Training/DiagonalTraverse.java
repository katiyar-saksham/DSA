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

            if (isUp) { // up-right
                i--;
                j++;
            } else { // down-left
                i++;
                j--;
            }

            // boundary conditions
            if (i < 0 && j < n) { // Hit top
                i = 0;
                isUp = !isUp;
            } else if (j < 0 && i < m) { // Hit left
                j = 0;
                isUp = !isUp;
            } else if (i >= m) { // Hit bottom
                i = m - 1;
                j += 2;
                isUp = !isUp;
            } else if (j >= n) { // Hit right
                j = n - 1;
                i += 2;
                isUp = !isUp;
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

        // Print the result
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
}

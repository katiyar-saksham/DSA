import java.util.*;

public class DiagonalTraversal {

    public static List<Integer> diagonalTraversal(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        if (rows == 0)
            return result;
        int cols = matrix[0].length;

        int r = 0, c = 0;
        boolean isUp = true;

        while (r < rows && c < cols) {
            result.add(matrix[r][c]);

            if (isUp) {
                if (c == cols - 1) {
                    r++; // Hit last column, move down
                    isUp = false;
                } else if (r == 0) {
                    c++; // Hit first row, move right
                    isUp = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == rows - 1) {
                    c++; // Hit last row, move right
                    isUp = true;
                } else if (c == 0) {
                    r++; // Hit first column, move down
                    isUp = true;
                } else {
                    r++;
                    c--;
                }
            }

            if (r >= rows || c >= cols)
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> traversal = diagonalTraversal(matrix);
        for (int num : traversal) {
            System.out.print(num + " ");
        }
    }
}

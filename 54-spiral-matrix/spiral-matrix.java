import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        int maxElem = (bottom + 1) * (right + 1);
        int counter = 0;

        while (counter < maxElem) {
            // Traverse left to right
            for (int i = left; i <= right && counter < maxElem; i++) {
                result.add(matrix[top][i]);
                counter++;
            }
            top++;

            // Traverse top to bottom
            for (int i = top; i <= bottom && counter < maxElem; i++) {
                result.add(matrix[i][right]);
                counter++;
            }
            right--;

            // Traverse right to left
            for (int i = right; i >= left && counter < maxElem; i--) {
                result.add(matrix[bottom][i]);
                counter++;
            }
            bottom--;

            // Traverse bottom to top
            for (int i = bottom; i >= top && counter < maxElem; i--) {
                result.add(matrix[i][left]);
                counter++;
            }
            left++;
        }

        return result;
    }
}

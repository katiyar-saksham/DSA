class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][n - 1]) {
                return bs(matrix[i], target);
            }
        }
        return false;
    }

    private boolean bs(int[] row, int target) {
        int left = 0, right = row.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target)
                return true;
            else if (row[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
class CountUnguardedCellsInTheGrid {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        // Mark guards' positions
        for (int[] g : guards) {
            grid[g[0]][g[1]] = 2; // guard
        }

        // Mark walls' positions
        for (int[] w : walls) {
            grid[w[0]][w[1]] = 3; // wall
        }

        // For each guard, mark guarded cells in all 4 directions
        for (int[] guard : guards) {
            int i = guard[0];
            int j = guard[1];
            markGuarded(i, j, grid, m, n); // ✅ added missing call
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) { // unguarded
                    count++;
                }
            }
        }

        return count;
    }

    // Helper function to mark guarded cells in 4 directions
    private void markGuarded(int row, int col, int[][] grid, int m, int n) {
        // Up
        for (int r = row - 1; r >= 0 && grid[r][col] != 3 && grid[r][col] != 2; r--) {
            if (grid[r][col] == 0)
                grid[r][col] = 1;
        }

        // Down
        for (int r = row + 1; r < m && grid[r][col] != 3 && grid[r][col] != 2; r++) {
            if (grid[r][col] == 0)
                grid[r][col] = 1;
        }

        // Left
        for (int c = col - 1; c >= 0 && grid[row][c] != 3 && grid[row][c] != 2; c--) {
            if (grid[row][c] == 0)
                grid[row][c] = 1;
        }

        // Right
        for (int c = col + 1; c < n && grid[row][c] != 3 && grid[row][c] != 2; c++) {
            if (grid[row][c] == 0)
                grid[row][c] = 1;
        }
    }

    public static void main(String[] args) {
    CountUnguardedCellsInTheGrid cug = new CountUnguardedCellsInTheGrid();

    // Example 1
    int m1 = 3, n1 = 3;
    int[][] guards1 = { {1, 0}, {1, 2} };
    int[][] walls1 = { {2, 1}, {0, 1} };
    System.out.println("Example 1 Output: " + cug.countUnguarded(m1, n1, guards1, walls1));

    // Example 2
    int m2 = 4, n2 = 6;
    int[][] guards2 = { {0, 0}, {1, 1}, {2, 3} };
    int[][] walls2 = { {0, 1}, {2, 2}, {1, 4} };
    System.out.println("Example 2 Output: " + cug.countUnguarded(m2, n2, guards2, walls2));

    // Example 3
    int m3 = 2, n3 = 2;
    int[][] guards3 = { {0, 0} };
    int[][] walls3 = {};
    System.out.println("Example 3 Output: " + cug.countUnguarded(m3, n3, guards3, walls3));

    // Example 4
    int m4 = 5, n4 = 5;
    int[][] guards4 = { {0, 0}, {4, 4} };
    int[][] walls4 = { {2, 2}, {1, 3} };
    System.out.println("Example 4 Output: " + cug.countUnguarded(m4, n4, guards4, walls4));
}

}

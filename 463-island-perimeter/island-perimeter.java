class Solution {
    int peri;
    int n;
    int m;

    public int islandPerimeter(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    return peri;
                }
            }
        }
        return 0;
    }

    public void dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= n || c >= m || grid[r][c] == 0) {
            peri++;
            return;
        }

        if (grid[r][c] == -1) {
            return;
        }
        grid[r][c] = -1;

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
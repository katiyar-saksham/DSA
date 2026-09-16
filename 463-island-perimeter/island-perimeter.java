class Solution {public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int peri = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) continue;

                if(j+1>=m || grid[i][j+1] == 0) peri++;
                if(j-1<0 || grid[i][j-1] == 0) peri++;
                if(i+1>=n || grid[i+1][j] == 0) peri++;
                if(i-1<0 || grid[i-1][j] == 0) peri++;
            }
        }
        return peri;
    }

    // public void dfs(int[][] grid, int r, int c) {
    //     if (r < 0 || c < 0 || r >= n || c >= m || grid[r][c] == 0) {
    //         peri++;
    //         return;
    //     }

    //     if (grid[r][c] == -1) {
    //         return;
    //     }
    //     grid[r][c] = -1;

    //     dfs(grid, r - 1, c);
    //     dfs(grid, r + 1, c);
    //     dfs(grid, r, c - 1);
    //     dfs(grid, r, c + 1);
    // }
}
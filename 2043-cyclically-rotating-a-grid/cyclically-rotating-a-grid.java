class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;

        for (int lyr = 0; lyr < layers; lyr++) {

            int top = lyr;
            int right = n - lyr - 1;
            int bottom = m - lyr - 1;
            int left = lyr;

            Queue<Integer> q = new LinkedList<>();

            //top row
            for (int i = left; i <= right; i++) {
                q.offer(grid[top][i]);
            }

            //right col
            for (int j = top + 1; j <= bottom; j++) {
                q.offer(grid[j][right]);
            }

            //bottom row
            for (int i = right - 1; i >= left; i--) {
                q.offer(grid[bottom][i]);
            }

            //left col
            for (int j = bottom - 1; j > top; j--) {
                q.offer(grid[j][left]);
            }

            // rotations
            int len = q.size();
            int rotations = k % len;

            while (rotations-- > 0) {
                q.offer(q.remove());
            }

            //PUSH_BACK

            //top row
            for (int i = left; i <= right; i++) {
                grid[top][i] = q.remove();
            }

            //right col
            for (int j = top + 1; j <= bottom; j++) {
                grid[j][right] = q.remove();
            }

            //bottom row
            for (int i = right - 1; i >= left; i--) {
                grid[bottom][i] = q.remove();
            }

            //left col
            for (int j = bottom - 1; j > top; j--) {
                grid[j][left] = q.remove();
            }

        }
        return grid;
    }
}
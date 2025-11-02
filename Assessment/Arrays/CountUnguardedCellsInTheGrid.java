class CountUnguardedCellsInTheGrid {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(gu)

            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountUnguardedCellsInTheGrid cug = new CountUnguardedCellsInTheGrid();
        int m = 3;
        int n = 3;
        int[][] guards = { { 1, 0 } };
        int[][] walls = { { 2, 1 } };
        System.out.println(cug.countUnguarded(m, n, guards, walls));
    }
}
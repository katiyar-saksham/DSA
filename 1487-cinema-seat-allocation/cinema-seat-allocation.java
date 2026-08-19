class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            map.put(row, map.getOrDefault(row, 0) | (1 << (col - 1)));
        }

        int ans = (n - map.size()) * 2;

        int left = 0b0000011110; 
        int middle = 0b0001111000; 
        int right = 0b0111100000; 

        for (int mask : map.values()) {
            boolean l = (mask & left) == 0;
            boolean m = (mask & middle) == 0;
            boolean r = (mask & right) == 0;

            if (l && r) {
                ans += 2;
            } else if (l || m || r) {
                ans++;
            }
        }

        return ans;
    }
}
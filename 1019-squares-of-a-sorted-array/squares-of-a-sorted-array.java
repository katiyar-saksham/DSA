class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];

        int i = 0;
        for (int num : nums) {
            sq[i++] = num * num;
        }

        Arrays.sort(sq);
        return sq;
    }
}
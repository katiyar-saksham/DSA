class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                int dgt = num % 10;
                num /= 10;
                sum += dgt;
            }
            min = Math.min(min, sum);
            nums[i++] = sum;
        }
        return min;
    }
}
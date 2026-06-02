class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += helper(num);
        }
        return sum;
    }

    private int helper(int n) {
        int cnt = 0;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;

                if (d1 == d2) {
                    cnt++;
                    sum += d1;
                } else {
                    cnt += 2;
                    sum += d1 + d2;
                }

                if (cnt > 4) {
                    return 0;
                }
            }
        }
        return cnt == 4 ? sum : 0;
    }
}
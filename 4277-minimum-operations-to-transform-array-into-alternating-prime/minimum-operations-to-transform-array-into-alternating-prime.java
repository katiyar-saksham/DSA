class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                int nextPrime = getNextPrime(nums[i]);
                cnt += nextPrime - nums[i];
            } else {
                int nextNonPrime = getNextNonPrime(nums[i]);
                cnt += nextNonPrime - nums[i];
            }
        }

        return cnt;
    }

    private int getNextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    private int getNextNonPrime(int n) {
        while (isPrime(n)) {
            n++;
        }
        return n;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] diff = new int[n];
        long maxDiff = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        if (maxDiff == 0)
            return 0;

        long totalDiff = 0;
        for (int d : diff) {
            totalDiff += d;
        }

        if (k >= totalDiff)
            return 0;

        Arrays.sort(diff);

        long remaining = k;

        for (int i = n - 1; i >= 0; i--) {
            long current = diff[i];
            long next = (i > 0) ? diff[i - 1] : 0;
            long count = n - i;

            long cost = (current - next) * count;

            if (remaining >= cost) {
                remaining -= cost;
            } else {
                long reduction = remaining / count;
                long extra = remaining % count;

                long high = current - reduction;
                long low = high - 1;

                long sum = 0;

                sum += extra * low * low;
                sum += (count - extra) * high * high;

                for (int j = 0; j < i; j++) {
                    sum += (long) diff[j] * diff[j];
                }

                return sum;
            }
        }
        return 0;
    }
}
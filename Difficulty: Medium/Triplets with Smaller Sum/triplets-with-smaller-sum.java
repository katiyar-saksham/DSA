class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                long currSum = arr[i] + arr[l] + arr[r];

                if (currSum < sum) {
                    count += (r - l);
                    l++;
                } else {
                    r--;
                }
            }
        }

        return count;
    }
}
class Solution {
    public long maxAlternatingSum(int[] arr) {
        long sum = 0;
        int l = 0;
        int r = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        Arrays.sort(arr);

        while (l < r) {

            // sum += (long)(arr[l] * arr[l]) - (arr[r] * arr[r]);
            sum += (long) arr[r] * arr[r]
                    - (long) arr[l] * arr[l];
            l++;
            r--;
        }
        if (l == r) {
            sum += (long) arr[l] * arr[l];
        }

        return sum;
    }
}
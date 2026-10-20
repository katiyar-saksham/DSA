class Solution {
    private int[] buildLPS(int[] arr, int start, int k) {
        int[] lps = new int[k];
        int len = 0;

        for (int i = 1; i < k;) {
            if (arr[start + i] == arr[start + len]) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    private boolean isRotation(int[] a, int aStart,
            int[] b, int bStart, int k) {
        int[] lps = buildLPS(b, bStart, k);
        int j = 0;

        for (int i = 0; i < 2 * k - 1; i++) {
            int value = a[aStart + i % k];

            while (j > 0 && value != b[bStart + j]) {
                j = lps[j - 1];
            }

            if (value == b[bStart + j]) {
                j++;
            }

            if (j == k) {
                return true;
            }
        }
        return false;
    }

    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int answer = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;

            for (int start = 0; start < n; start += k) {
                if (!isRotation(nums, start, sorted, start, k)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                answer += k;
            }
        }

        return answer;
    }
}
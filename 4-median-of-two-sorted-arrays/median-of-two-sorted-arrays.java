class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int cnt = 0;

        int[] res = new int[n + m];

        for (int i = 0; i < n; i++) {
            res[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            res[n + i] = nums2[i];
        }

        Arrays.sort(res);

        int length = res.length;
        
        if (length % 2 == 0) {
            return (res[length / 2 - 1] + res[length / 2]) / 2.0;
        } else {
            return res[length / 2];
        }
    }
}
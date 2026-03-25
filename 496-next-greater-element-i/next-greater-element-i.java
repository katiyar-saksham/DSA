import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[] nge = new int[n];

        // Step 1: Compute NGE for nums2
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }

        // Step 2: For each element in nums1, find it in nums2
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int element = nums1[i];

            // find index in nums2
            for (int j = 0; j < n; j++) {
                if (nums2[j] == element) {
                    res[i] = nge[j];
                    break;
                }
            }
        }

        return res;
    }
}
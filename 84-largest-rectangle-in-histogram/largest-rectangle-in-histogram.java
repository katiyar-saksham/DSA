class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] right = new int[n];
        int[] left = new int[n];
        int maxArea = 0;

        //left smaller
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();//MOST IMPT LINE

        //right smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }
        return maxArea;
    }
}
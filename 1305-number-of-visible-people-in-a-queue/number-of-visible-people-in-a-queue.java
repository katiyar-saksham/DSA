class Solution {
    public int[] canSeePersonsCount(int[] ht) {
        int n = ht.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int cnt = 0;

            while (!st.isEmpty() && ht[st.peek()] < ht[i]) {
                st.pop();
                cnt++;
            }

            if (!st.isEmpty()) {
                cnt++;
            }

            res[i] = cnt;
            st.push(i);
        }
        return res;
    }
}
class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("C")) {
                st.pop();
            } else if (s[i].equals("D")) {
                st.push(2 * st.peek());
            } else if (s[i].equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else {
                st.push(Integer.parseInt(s[i]));
            }
        }
        int sum = 0;
        for (int num : st) {
            sum += num;
        }

        return sum;
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int a = st.pop();
                int b = st.pop();

                if (ch.equals("+"))
                    st.push(b + a);
                else if (ch.equals("-"))
                    st.push(b - a);
                else if (ch.equals("*"))
                    st.push(b * a);
                else
                    st.push(b / a);
            } else {
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}
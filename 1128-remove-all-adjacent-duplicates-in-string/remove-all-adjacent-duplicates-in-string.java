class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!st.isEmpty() && s.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
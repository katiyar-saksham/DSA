class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if (st.isEmpty()) {
            return;
        }
        
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }
    
    private static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        st.push(x);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return st;
    }
}

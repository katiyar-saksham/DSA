class MinStack {
    Stack<Pair<Integer, Integer>> st = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair<>(val, val));
        } else {
            int currMin = Math.min(val, st.peek().value);
            st.push(new Pair<>(val, currMin));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().key;
    }

    public int getMin() {
        return st.peek().value;
    }
}

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
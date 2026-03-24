class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class CustomStack {
    Node top; // top == head of ll
    int size;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.top = null;
    }

    public void push(int x) {
        if (size == maxSize)
            return;

        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
    }

    public int pop() {
        if (size == 0)
            return -1;

        int val = top.val;
        top = top.next;
        size--;
        return val;

    }

    public void increment(int k, int val) {
        if (top == null) {
            return;
        }

        Node temp = top;

        int skip = Math.max(0, size - k);

        while (skip > 0 && temp != null) {
            temp = temp.next;
            skip--;
        }

        while (temp != null) {
            temp.val += val;
            temp = temp.next;
        }

    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
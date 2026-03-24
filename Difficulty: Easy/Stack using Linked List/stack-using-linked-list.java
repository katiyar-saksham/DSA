// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    
    Node top;
    int size;

    public myStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void push(int x) {
        Node temp = new Node(x);
        temp.next=top;
        top=temp;
        size++;
    }

    public void pop() {
        if (isEmpty()) return;
        
        top=top.next;
        size--;
    }

    public int peek() {
        if (isEmpty()) return -1;

        return top.data;
    }

    public int size() {
        return size;
    }
}

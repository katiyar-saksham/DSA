public class Main {

    // Node class
    static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    // Doubly Linked List class
    static class DLL {

        Node head;
        Node tail;
        int size;

        // Insert at head
        void insertAtHead(int val) {

            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }

            size++;
        }

        // Insert at tail
        void insertAtTail(int val) {

            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }

            size++;
        }

        // Delete at head
        void delAtHead() {

            if (head == null) {
                return;
            }

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            size--;
        }

        // Delete at tail
        void delAtTail() {

            if (head == null) {
                return;
            }

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }

            size--;
        }

        // Display forward
        void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Display backward
        void displayReverse() {

            Node temp = tail;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }

            System.out.println();
        }

        // Show size
        void showSize() {
            System.out.println("Size = " + size);
        }

        //Insert at Index
        void insertAtIndex(int idx, int val) {

            if (idx < 0 || idx > size) {
                System.out.println("Invalid Index");
                return;
            }

            if (idx == 0) {
                insertAtHead(val);
                return;
            }

            if (idx == size) {
                insertAtTail(val);
                return;
            }

            Node newNode = new Node(val);
            Node temp = head;

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;
            temp.next = newNode;

            size++;
        }

        void deleteAtIndex(int idx) {

            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Index");
                return;
            }

            // Delete first
            if (idx == 0) {
                delAtHead();
                return;
            }

            // Delete last
            if (idx == size - 1) {
                delAtTail();
                return;
            }

            // Delete middle
            Node temp = head;

            // Move to node at idx
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            size--;
        }

        Node reverseDLL(Node head) {
            Node pre = null;
            Node curr = head;
            Node fwd = null;

            while (curr != null) {
                fwd = curr.next;

                curr.next = pre;
                curr.prev = fwd;

                pre = curr;
                curr = fwd;
            }
            return pre;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        DLL list = new DLL();

        System.out.println("=== Insert at Head ===");
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();          // 30 20 10
        list.displayReverse();   // 10 20 30
        list.showSize();

        System.out.println("\n=== Insert at Tail ===");
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();          // 30 20 10 40 50
        list.displayReverse();   // 50 40 10 20 30
        list.showSize();

        System.out.println("\n=== Insert at Index 2 ===");
        list.insertAtIndex(2, 99);
        list.display();          // 30 20 99 10 40 50
        list.displayReverse();
        list.showSize();

        System.out.println("\n=== Delete at Head ===");
        list.delAtHead();
        list.display();          // 20 99 10 40 50
        list.showSize();

        System.out.println("\n=== Delete at Tail ===");
        list.delAtTail();
        list.display();          // 20 99 10 40
        list.showSize();

        System.out.println("\n=== Delete at Index 1 ===");
        list.deleteAtIndex(1);
        list.display();          // 20 10 40
        list.head = list.reverseDLL(list.head);

        Node temp = list.head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        list.tail = temp;

        System.out.println("After Reverse:");
        list.display();
        list.displayReverse();
        list.showSize();
    }
}
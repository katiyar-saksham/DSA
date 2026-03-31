public class Linkedlist {
    Node head;
    Node tail;
    int size;

    public static void main(String[] args) {
        System.out.println();
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
//        printList(ll.head);

//        ll.addAtHead(0);
        System.out.print("Original Linked List: ");
        printList(ll.head);

//        ll.deleteAtHead();
//        printList(ll.head);

//        System.out.println(ll.search(90));

//        ll.insert(3, 99);
        ll.del(3);/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

        class Solution {
            int getMiddle(Node head) {
                // code here
                Node slow=head;
                Node fast=head;

                while(fast.next!=null&&fast!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow.data;

            }
        }
        System.out.print("Updated Linked List: ");
        printList(ll.head);

    }

    private void del(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size - 1) {
            tail = temp; //deleting tail
        }
        size--;
    }
    private void insert(int idx, int x) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException();
        } else if (idx == 0) {  // insert at head
            addAtHead(x);
        } else if (idx == size) { // insert at tail
            addAtTail(x);
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(x);
            t.next = temp.next;
            temp.next = t;

            size++;
        }
    }
    private int search(int x) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.val == x) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    private void deleteAtHead() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }
    private void addAtTail(int x) {
        Node temp = new Node(x);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    private static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private void addAtHead(int i) {
        Node temp = new Node(i);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = temp;
        }
        size++;
    }
}

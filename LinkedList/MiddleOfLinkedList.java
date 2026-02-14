package LinkedList;

public class MiddleOfLinkedList {

    public static Node deleteMiddle(Node head) {
        // your logic
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
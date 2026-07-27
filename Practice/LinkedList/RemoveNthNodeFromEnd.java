package LinkedList;

public class RemoveNthNodeFromEnd {

    public static Node removeNthFromEnd(Node head, int n) {
        Node dm = new Node(0);
        dm.next = head;
        Node slow = dm;
        Node fast = dm;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dm.next;
    }
}
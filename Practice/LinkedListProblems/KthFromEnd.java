package LinkedList;

public class KthFromEnd {

    public static Node getKthFromEnd(Node head, int k) {
        Node slow = head, fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
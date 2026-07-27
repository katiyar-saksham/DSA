package LinkedList;

public class DeleteNodeInLinkedList {

    public static void deleteNode(Node node) {
        if (node == null || node.next == null) {
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
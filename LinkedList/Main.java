package LinkedList;

public class Main {

    // Print Linked List
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Create Sample Linked List
    public static Node createList() {

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {

        // =========================
        // 1. Test Delete Middle
        // =========================
        Node head1 = createList();
        System.out.println("Original List:");
        printList(head1);

        head1 = DeleteMiddleNode.deleteMiddle(head1);
        System.out.println("After Delete Middle:");
        printList(head1);
        System.out.println("--------------------------------");
        // =========================
        // 2. Test Delete Given Node
        // =========================
        Node head2 = createList();
        System.out.println("\nOriginal List:");
        printList(head2);

        DeleteNodeInLinkedList.deleteNode(head2.next);
        System.out.println("After Delete Second Node:");
        printList(head2);
        System.out.println("--------------------------------");
        // =========================
        // 3. Test Remove Nth From End
        // =========================
        Node head3 = createList();
        System.out.println("\nOriginal List:");
        printList(head3);

        head3 = RemoveNthNodeFromEnd.removeNthFromEnd(head3, 2);
        System.out.println("After Remove 2nd From End:");
        printList(head3);
        System.out.println("--------------------------------");
        // =========================
        // 4. Test Kth From End
        // =========================
        Node head4 = createList();
        System.out.println("\nOriginal List:");
        printList(head4);

        Node kth = KthFromEnd.getKthFromEnd(head4, 3);
        System.out.println("3rd From End: " + kth.val);
    }
}


//javac LinkedList/*.java && java LinkedList.Main
class Solution {

    //1. deep copy
    public Node deepCopy(Node head1) {
        Node dm = new Node(-1);
        Node temp = dm;

        Node curr = head1;

        while (curr != null) {
            Node copy = new Node(curr.val);
            temp.next = copy;
            temp = temp.next;
            curr = curr.next;
        }
        return dm.next;
    }

    //2. Merge lists alternatively
    public void merge(Node head1, Node head2) {

        Node t1 = head1;
        Node t2 = head2;

        while (t1 != null && t2 != null) {

            Node next1 = t1.next;
            Node next2 = t2.next;

            t1.next = t2;
            t2.next = next1;

            t1 = next1;
            t2 = next2;
        }
    }

    //3. assign random pointers
    public void assignRandom(Node head) {
        Node temp = head;

        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
    }

    //4. separation of lists
    public Node sep(Node head) {
        Node curr = head;
        Node newHead = head.next;
        Node t2 = head.next;

        while (curr != null) {
            curr.next = curr.next.next;

            if (t2.next != null) {
                t2.next = t2.next.next;
            }
            curr = curr.next;
            t2 = t2.next;
        }

        return newHead;
    }

    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        // Step 1
        Node copyHead = deepCopy(head);

        // Step 2
        merge(head, copyHead);

        // Step 3
        assignRandom(head);

        // Step 4
        return sep(head);
    }
}
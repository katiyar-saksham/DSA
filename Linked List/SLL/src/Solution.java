import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    private static Node delAtN(Node head, int n) {
        Node dm = new Node(0);
        dm.next = head;

        Node fast = dm;
        Node slow = dm;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dm.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String len = sc.nextLine();
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        StringTokenizer st = new StringTokenizer(len);

        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());

            Node nw = new Node(val);

            if (head == null) {
                head = tail = nw;
            } else {
                tail.next = nw;
                tail = nw;
            }
        }

        head = delAtN(head, n);

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" ");
            }
            curr = curr.next;
        }
    }
}
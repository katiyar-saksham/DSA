import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    static Node deleteNthFromEnd(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int n = sc.nextInt();

        String[] arr = line.trim().split("\\s+");

        Node head = null;
        Node tail = null;

        for (String s : arr) {
            int val = Integer.parseInt(s);

            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = deleteNthFromEnd(head, n);

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null)
                System.out.print(" ");
            curr = curr.next;
        }
    }
}

public class DisplayList {
    public static void display(Node head) {
        //WHILE LOOP
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        //FOR LOOP
//        for (Node temp = head; temp != null; temp = temp.next) {
//            System.out.print(temp.val+" ");
//        }
        System.out.println();
    }

    public static void displayRec(Node head) {
        if (head == null) return;

        System.out.print(head.val + " ");
        displayRec(head.next);

        //LL ko reverse order m print krne k liye phele call then print
//        displayRec(head.next);
//        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        //10->20->30->40->50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        display(a);
//        displayRec(a);
        System.out.println(get(a, 2));
    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) { //O(n) T.C of finding elem in LL of size n
            temp = temp.next;
        }
        return temp.val;
    }
}

public class DisplayList {
	public static void display(SLLNode head) {
		//WHILE LOOP
		SLLNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		//FOR LOOP
//        for (SLLNode temp = head; temp != null; temp = temp.next) {
//            System.out.print(temp.val+" ");
//        }
		System.out.println();
	}

	public static void displayRec(SLLNode head) {
		if (head == null) return;

		System.out.print(head.val + " ");
		displayRec(head.next);

		//LL ko reverse order m print krne k liye phele call then print
//        displayRec(head.next);
//        System.out.print(head.val + " ");
	}

	public static void main(String[] args) {
		//10->20->30->40->50
		SLLNode a = new SLLNode(10);
		SLLNode b = new SLLNode(20);
		SLLNode c = new SLLNode(30);
		SLLNode d = new SLLNode(40);
		SLLNode e = new SLLNode(50);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
//        display(a);
//        displayRec(a);
		System.out.println(get(a, 2));
	}

	private static int get(SLLNode head, int idx) {
		SLLNode temp = head;
		for (int i = 0; i < idx; i++) { //O(n) T.C of finding elem in LL of size n
			temp = temp.next;
		}
		return temp.val;
	}
}

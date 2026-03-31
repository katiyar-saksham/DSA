class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Implementation {
    public static void main(String[] args) {

        // Tree structure:
        //              a(3)
        //            /      \
        //         b(4)      c(2)
        //        /   \      /   \
        //    d(-1) e(1)  f(6)  g(9)

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        System.out.print("Inorder Traversal: ");
        display(a);
        System.out.println();
//
//        int size = size(a);
//        System.out.println("\nSize of tree: " + size);
//
//        int sum = sum(a);
//        System.out.println("Sum of tree: " + sum);
//
//        int pdt = product(a);
//        System.out.println("Non Zero product: " + pdt);
//
//        int max = max(a);
//        System.out.println("Maximum val: " + max);

        int lvl = levels(a);
        System.out.println("Levels: " + lvl);
    }

    private static int levels(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHt = levels(root.left);
        int rightHt = levels(root.right);

        return 1 + Math.max(leftHt, rightHt);
    }

    private static int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = max(root.left);
        int rightMax = max(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    private static void display(Node root) {
        if (root == null) return;

        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    private static int size(Node root) {
        if (root == null) return 0;

        return 1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }

    private static int product(Node root) {
        if (root == null) {
            return 1;
        }

        int left = product(root.left);
        int right = product(root.right);

        int current = (root.val == 0) ? 1 : root.val;

        return current * left * right;
    }
}
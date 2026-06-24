import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class BinaryTreeSum {
    private static Node buildTree(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) {
            return null;
        }

        Node root = new Node(val);

        root.left = buildTree(sc);
        root.right = buildTree(sc);

        return root;
    }

    private static int sum(Node root) {
        if (root == null)
            return 0;

        return sum(root.left)
                + sum(root.right)
                + root.val;
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = buildTree(sc);
        System.out.print("Postorder Traversal: ");
        postOrder(root);
        System.out.println();

        System.out.println("Sum of all nodes: " + sum(root));
    }
}

//while making tree using array why we use 2*i+1 or +2?
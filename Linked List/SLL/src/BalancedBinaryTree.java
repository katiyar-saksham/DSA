import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {
    static Node buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node curr = q.poll();

            if (i < arr.length && arr[i] != -1) {
                curr.left = new Node(arr[i]);
                q.offer(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != -1) {
                curr.right = new Node(arr[i]);
                q.offer(curr.right);b
            }
            i++;
        }

        return root;
    }

    public static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        if (left == -1) {
            return -1;
        }

        int right = height(root.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(right - left) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr);
        System.out.println(isBalanced(root));
        sc.close();
    }

}
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
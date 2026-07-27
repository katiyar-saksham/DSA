import java.util.*;

class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(Node root) {
        ht(root);
        return ans;
    }

    private int ht(Node root) {
        if (root == null) {
            return 0;
        }

        int left = ht(root.left);
        int right = ht(root.right);

        ans = Math.max(ans, left + right);

        return 1 + Math.max(left, right);
    }
}
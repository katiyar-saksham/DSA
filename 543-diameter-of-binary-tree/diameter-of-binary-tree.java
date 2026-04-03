class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ht(root);
        return ans;
    }

    private int ht(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = ht(root.left);
        int right = ht(root.right);

        ans = Math.max(ans, left + right);

        return 1 + Math.max(left, right);
    }
}
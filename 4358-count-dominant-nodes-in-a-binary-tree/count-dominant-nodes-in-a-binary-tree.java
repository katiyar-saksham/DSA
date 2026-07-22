class Solution {
    int res = 0;

    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = dfs(root.left);
        int rightMax = dfs(root.right);

        int subtreeMax = Math.max(root.val, Math.max(leftMax, rightMax));

        if (subtreeMax == root.val) {
            res++;
        }

        return subtreeMax;
    }
}
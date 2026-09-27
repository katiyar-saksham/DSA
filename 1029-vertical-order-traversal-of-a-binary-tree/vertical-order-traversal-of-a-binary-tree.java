class Pair {
    TreeNode node;
    int row;
    int hd;

    Pair(TreeNode node, int row, int hd) {
        this.node = node;
        this.row = row;
        this.hd = hd;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        TreeMap<Integer, List<int[]>> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            TreeNode node = curr.node;
            int row = curr.row;
            int hd = curr.hd;

            // if (!map.containsKey(hd)) {
            //     map.put(hd, new ArrayList<>());
            // }
            // map.get(hd).add(node.val);

            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(new int[] { row, node.val });

            if (node.left != null) {
                q.offer(new Pair(node.left, row + 1, hd - 1));
            }
            if (node.right != null) {
                q.offer(new Pair(node.right, row + 1, hd + 1));
            }
        }

        for (List<int[]> lst : map.values()) {
            Collections.sort(lst, (a, b) -> {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });

            List<Integer> column = new ArrayList<>();

            for (int[] pair : lst) {
                column.add(pair[1]);
            }

            ans.add(column);
        }

        return ans;
    }
}
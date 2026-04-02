class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        boolean leftToRight = true;
        
        while(!q.isEmpty()){
            int sz = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < sz; i++) {
                Node front = q.remove();
            
                if (leftToRight) {
                    level.add(front.data);
                } else {
                    level.add(0, front.data);
                }
            
                if (front.left != null) q.add(front.left);
                if (front.right != null) q.add(front.right);
            }
            res.addAll(level);

            leftToRight = !leftToRight;
        }
        return res;
    }
}
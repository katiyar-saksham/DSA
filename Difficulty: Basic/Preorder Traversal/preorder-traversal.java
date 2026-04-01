class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    
    private void helper(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        
        result.add(node.data);
        helper(node.left, result);
        helper(node.right, result);
    }
}
/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = this.right = null;
	}
} */

class Solution {
	public ArrayList<Integer> leftView(Node root) {
		ArrayList<Integer> lst = new ArrayList<>();
		
		if (root == null) {
			return lst;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while (!q.isEmpty()) {
			int size = q.size();
			
			lst.add(q.peek().data);
			
			for (int i = 0; i<size; i++) {
				Node val = q.poll();
				if (val.left != null) {
					q.add(val.left);
				}
				if (val.right != null) {
					q.add(val.right);
				}
			}
		}
		return lst;
	}
}

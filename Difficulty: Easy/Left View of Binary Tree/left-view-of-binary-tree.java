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
		// code here
		ArrayList<Integer> lst = new ArrayList<>();
		
		if (root == null) {
			return lst;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		
		while (!q.isEmpty()) {
			int size = q.size();
			
			lst.add(q.peek().data);
			for (int i = 0; i<size; i++) {
				Node curr = q.poll();
				
				if (curr.left != null) {
					q.offer(curr.left);
				}
				if (curr.right != null) {
					q.offer(curr.right);
				}
			}
		}
		return lst;
		
	}
}

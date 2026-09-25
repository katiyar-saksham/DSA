class Solution {
	public ArrayList<Integer> boundaryTraversal(Node root) {
		// code here
		ArrayList<Integer> lst = new ArrayList<>();
		
		if (root == null) {
			return lst;
		}
		
		lst.add(root.data);
		left(root.left, lst);
		leaves(root.left, lst);
		leaves(root.right, lst);
		right(root.right, lst);
		
		return lst;
	}
	
	// store left boundary
	private void left(Node root, ArrayList<Integer> lst) {
		if (root == null || (root.left == null && root.right == null)) {
			return;
		}
		
		lst.add(root.data);
		
		if (root.left != null) {
			left(root.left, lst);
		} else {
			left(root.right, lst);
		}
	}
	
	// store leaf nodes
	private void leaves(Node root, ArrayList<Integer> lst) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			lst.add(root.data);
			return;
		}
		leaves(root.left, lst);
		leaves(root.right, lst);
	}
	
	// Store right boundary in reverse order
	private void right(Node root, ArrayList<Integer> lst) {
		if (root == null || (root.left == null && root.right == null)) {
			return;
		}
		if (root.right != null) {
			right(root.right, lst);
		} else {
			right(root.left, lst);
		}
		lst.add(root.data);
	}
}

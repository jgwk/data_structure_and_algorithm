package tree;

public class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public void insert(int data) {
		Node temp = new Node();
		temp.data = data;
		
		if(root == null) {
			root = temp;
			return;
		}
		
		Node pre = root;
		Node cur = root;
		while(cur != null) {
			pre = cur;
			if(data > cur.data) {
				cur = cur.right;
			} else {
				cur = cur.left;
			}
		}
		
		if(data > pre.data) pre.right = temp;
		else pre.left = temp;
	}
	
	public Node getNode(int data) {
		if(root == null) return null;
		
		Node cur = root;
		while(true) {
			if(cur == null) break;
			if(cur.data == data) return cur;
			cur = data > cur.data ? cur.right : cur.left;
		}
		
		return null;
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(Node n) {
		System.out.println(n.data);
		if(n.left != null) preOrder(n.left);
		if(n.right != null) preOrder(n.right);
	}
	
	public void levelOrder() {
		levelOrder(root);
	}
	
	public void levelOrder(Node n) {
		int level = height(n);
		
		for(int i=1; i<=level; i++) {
			levelOrderPrint(n, i);
		}
		
	}
	
	private void levelOrderPrint(Node n, int level) {
		if(n == null) return;
		if(level == 1) {
			System.out.println(n.data);
		}
		else if(level > 1) {
			levelOrderPrint(n.left, level-1);
			levelOrderPrint(n.right, level-1);
		}
	}
	
	
	
	public int height() {
		return height(root);
	}
	
	public int height(Node n) {
		if(n == null) return 0;
		
		int l = 1;
		int r = 1;
		if(n.left != null) l = height(n.left) + 1;
		if(n.right != null) r = height(n.right) + 1;
		
		return l > r ? l : r;
	}
}

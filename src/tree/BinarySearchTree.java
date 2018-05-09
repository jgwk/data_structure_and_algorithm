package tree;

public class BinarySearchTree {
	public static void main(String[] args) {
		/*
					4
		1								8
			2				5					10
				3					7		9
								6
		 */
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(4);
		bst.insert(1);
		bst.insert(8);
		bst.insert(2);
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(10);
		bst.insert(9);
		bst.insert(6);
		
		System.out.println("*pre order root");
		bst.preOrder();
		
		System.out.println("*pre order 5");
		bst.preOrder(bst.getNode(5));
		
		System.out.println("*level order root");
		bst.levelOrder();
		
		System.out.println("*level order 8");
		bst.levelOrder(bst.getNode(8));
	}

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

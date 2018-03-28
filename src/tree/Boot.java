package tree;

public class Boot {
	public static void main(String[] args) {
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
		
		//bst.preOrder();
		//bst.preOrder(bst.getNode(5));
		bst.levelOrder();
		//bst.levelOrder(bst.getNode(5));
		
	}
}
/*

				4
	1							8
		2				5					10
			3					7		9
							6

*/
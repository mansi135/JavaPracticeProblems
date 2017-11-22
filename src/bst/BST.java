package bst;

class Node {
	 int data;
	 Node left, right;
	
	 public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	 }
	
 }	
 
 class TreeImplementation {
	 
	 Node root = null;
	 
	 public void addNode(int data) {
		 if (root == null) {
			 root = new Node(data);
		 } else {
			 addNodeRcrs(root,data);
		 }
	 }
	 
	 public void addNodeRcrs(Node root, int data) {
		
		 if (root.data >= data) {
			 if (root.left == null) {
				 root.left = new Node(data);
			 } else {
				 addNodeRcrs(root.left,data);
			 }
		 } else {
			 if (root.right == null) {
				 root.right = new Node(data);
			 } else {
				 addNodeRcrs(root.right,data);
			 }
		 }
		
	}
	 
	 public boolean contains(Node root, int data) {
		 
		 boolean result = false;
		 if (root == null) {
			 result = false;
		 } else if (root.data == data) {
			 result = true;
		 } else if (root.data > data) {
			 result = contains(root.left, data);
		 } else if (root.data < data) {
			 result = contains(root.right, data);
		 }
		 
		 return result;	 
		 
	 }	
	 
	 public void inOrderTraversal(Node n ) {
		 
		 if(n != null) {
			
			 inOrderTraversal (n.left);
			 
			 System.out.println(n.data);
			 
			 inOrderTraversal (n.right);
		 }
		 
	 }
	
}
 
 
 public class BST{
	 
	public static void main(String[] args) {
		
		TreeImplementation tree = new TreeImplementation();
		tree.addNode(3);
		tree.addNode(4);
		tree.addNode(1);
		tree.addNode(2);
		tree.inOrderTraversal(tree.root);
		System.out.println(tree.contains(tree.root,6));
		tree.addNode(6);
		tree.addNode(20);
		tree.addNode(8);
		tree.inOrderTraversal(tree.root);
		System.out.println(tree.contains(tree.root,6));

		
	
	}
	
 }

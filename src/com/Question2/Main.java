package com.Question2;

public class Main {
	static BSTtoRS tree = new BSTtoRS();

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

        // Hardcoded Driver code
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left= new Node(55);

        tree.BSTtoRST(tree.root);

        // Skewed Tree
        System.out.print("Skewed Tree: ");
        tree.Traverse_Tree(tree.headNode);
    }

}

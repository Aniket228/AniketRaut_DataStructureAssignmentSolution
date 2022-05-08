package com.Question2;

public class BSTtoRS {
	public static Node root;
    static Node prevNode = null;
    public static Node headNode = null;
    public void BSTtoRST(Node root) {
        if(root == null)
            return;

        BSTtoRST(root.left);
     // Condition to check if the root no of the skewed tree
        if(headNode == null)
            headNode = root;
        else
            prevNode.right = root;

        root.left = null;
        prevNode = root;

        BSTtoRST(root.right);
    }

    public void Traverse_Tree(Node root) {
        if(root == null)
            return;

        if (root.left != null)
            Traverse_Tree(root.left);

        System.out.print(root.data + " ");

        if (root.right != null)
            Traverse_Tree(root.right);
    }
}

	//Class of the node

class Node
{
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
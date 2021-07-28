package com.hacker_rank.data_structures.trees;

public class _07_BinaryTreeInsert {

	public Node binaryTreeInsert(Node tree, int data) {
		
		Node nodeToInsert = new Node();
		nodeToInsert.data = data;
		
        if (tree == null) {

            return nodeToInsert;
        }
		
		Node temp = tree;
		while(temp.left != null && temp.right != null) {
			
			
			temp = temp.data > data ? temp.left : temp.right;
		}
		
		if (temp.data > data) {
			
			temp.left = nodeToInsert;
		} else {
			
			temp.right = nodeToInsert;
		}
		
		return tree;
	}
}

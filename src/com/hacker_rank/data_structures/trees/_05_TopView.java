package com.hacker_rank.data_structures.trees;

public class _05_TopView {

	public void topView(Node root) {
		
		traverseLeft(root.left);
		System.out.print(root.data + " ");
		traverseRight(root.right);
	}

	private void traverseLeft(Node node) {
		
		if (node == null) return;
		
		traverseLeft(node.left);
		System.out.print(node.data + " ");
	}
	
	private void traverseRight(Node node) {
		
		if (node == null) return;
		
		System.out.print(node.data + " ");
		traverseLeft(node.right);
	}
}

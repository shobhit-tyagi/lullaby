package com.hacker_rank.data_structures.trees;

public class _03_InOrder {

	public void inOrder(Node tree) {
		
		if (tree == null) {
			
			return;
		}
		
		inOrder(tree.left);
		System.out.print(tree.data + " ");
		inOrder(tree.right);
	}
}

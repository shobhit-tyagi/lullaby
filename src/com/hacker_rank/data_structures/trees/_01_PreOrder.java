package com.hacker_rank.data_structures.trees;

public class _01_PreOrder {

	public void preOrder(Node tree) {
		
		if (tree == null) {
			
			return;
		}
		
        System.out.print(tree.data + " ");
        preOrder(tree.left);
        preOrder(tree.right);
	}
}

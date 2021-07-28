package com.hacker_rank.data_structures.trees;

public class _02_PostOrder {

	public void postOrder(Node tree) {
		
		if (tree == null) {
			
			return;
		}
		
		postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.data + " ");
	}
}

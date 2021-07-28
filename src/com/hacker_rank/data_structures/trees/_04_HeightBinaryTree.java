package com.hacker_rank.data_structures.trees;

public class _04_HeightBinaryTree {

	public int heightBinaryTree(Node tree) {
		
		if (tree == null) {
			
			return -1;
		}
		
		int heightLeft = 1 + heightBinaryTree(tree.left);
		int heightRight = 1 + heightBinaryTree(tree.right);
		
		return heightLeft > heightRight ? heightLeft : heightRight;
	}
}

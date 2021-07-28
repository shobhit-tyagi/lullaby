package com.hacker_rank.data_structures.trees;

public class _09_LowestCommonAncestor {

	public Node lowestCommonAncestor(Node root, int v1, int v2) {
		
		while(root != null) {
			
			if (root.data > v1 && root.data > v2) {
				
				root = root.left;
			} else if (root.data < v1 && root.data < v2) {
				
				root = root.right;
			} else {
				
				break;
			}
		}
		
		return root;
	}
}

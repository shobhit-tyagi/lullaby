package com.hacker_rank.data_structures.trees;

public class _08_HuffmanCoding {

	public void huffmanCoding(Node tree, String encodedStr) {
		
		Node temp = tree;
		
		for (int index = 0; index < encodedStr.length(); index ++) {
			
			if (encodedStr.charAt(index) == '0') {
				
				temp = temp.left;
			} else {
				
				temp = temp.right;
			}
			
			if (temp.left == null && temp.right == null) {
				
				System.out.print(temp.data + " ");
				temp = tree;
			}
		}
	}
}

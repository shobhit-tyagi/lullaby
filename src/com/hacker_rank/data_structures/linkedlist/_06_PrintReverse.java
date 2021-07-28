package com.hacker_rank.data_structures.linkedlist;

public class _06_PrintReverse {

	public void printReverse(Node node) {
		
        if (node == null) {
            return;
        }
		
		printReverse(node.next);
		System.out.println(node.data);
	}
}

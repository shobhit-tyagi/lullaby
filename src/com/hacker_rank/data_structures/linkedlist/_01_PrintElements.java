package com.hacker_rank.data_structures.linkedlist;

public class _01_PrintElements {

	public void print(Node node) {
		
		while(node != null) {
			
			System.out.println(node.data);
			node = node.next;
		}
	}
}

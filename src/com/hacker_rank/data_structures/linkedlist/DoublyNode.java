package com.hacker_rank.data_structures.linkedlist;

public class DoublyNode {
	
	int data;
	DoublyNode next;
	DoublyNode previous;
	
	public DoublyNode() {
	}
	
	public DoublyNode(final int data) {
		
		this.data = data;
		this.next = null;
		this.previous = null;
	}
}

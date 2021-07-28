package com.hacker_rank.data_structures.linkedlist;

public class _15_ReverseDoublyList {

	public DoublyNode reverseDoublyList(DoublyNode list) {
		
		DoublyNode pointer = list;
		while(pointer.next != null) {
			
			DoublyNode previous = pointer.previous;
			DoublyNode next = pointer.next;
			pointer.next = previous;
			pointer.previous = next;
			
			pointer = next;
		}
		
		pointer.next = pointer.previous;
		pointer.previous = null;
		return pointer;
	}
}
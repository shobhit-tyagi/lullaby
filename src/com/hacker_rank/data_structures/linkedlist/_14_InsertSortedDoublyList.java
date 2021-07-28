package com.hacker_rank.data_structures.linkedlist;

public class _14_InsertSortedDoublyList {

	public DoublyNode insertSortedDoublyList(int data, DoublyNode list) {
		
		DoublyNode nodeToInsert = new DoublyNode(data);
		
		if (list.data >= data) {
			
			list.previous = nodeToInsert;
			nodeToInsert.next = list;
			return nodeToInsert;
		}
		
		DoublyNode pointer = list;
		while(pointer.next != null) {
			
			if (pointer.next.data >= data) {
				
				DoublyNode temp = pointer.next;
				pointer.next = nodeToInsert;
				nodeToInsert.next = temp;
				temp.previous = nodeToInsert;
				nodeToInsert.previous = pointer;
				
				return list;
			}
			
			pointer = pointer.next;
		}
		
		pointer.next = nodeToInsert;
		nodeToInsert.previous = pointer;
		
		return list;
	}
}
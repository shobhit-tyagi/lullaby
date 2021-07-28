package com.hacker_rank.data_structures.linkedlist;

public class _04_InsertAtIndex {

	public Node insertAtIndex(Node node, int data, int position) {
		
		Node nodeToInsert = new Node(data);
		
		Node temp1 = node;
		int index = 1;
		while (temp1.next != null) {
			
			if (index == position) {
				
				break;
			}
			temp1 = temp1.next;
			index ++;
		}
		Node temp2 = temp1.next;
		temp1.next = nodeToInsert;
		nodeToInsert.next = temp2;
		
		return node;
	}
}

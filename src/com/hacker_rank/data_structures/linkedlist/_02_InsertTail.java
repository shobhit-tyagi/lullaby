package com.hacker_rank.data_structures.linkedlist;

public class _02_InsertTail {

	public Node insertTail(Node node, int data) {
		
		Node nodeToInsert = new Node(data);
		if (node == null) {
			
			return nodeToInsert;
		}
		
		Node temp = node;
		while (temp.next != null) {
			
			temp = temp.next;
		}
		
		temp.next = nodeToInsert;
		return node;
	}
}

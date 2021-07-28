package com.hacker_rank.data_structures.linkedlist;

public class _03_InsertHead {

	public Node insertHead(Node node, int data) {
		
		Node nodeToInsert = new Node(data);
		nodeToInsert.next = node;
		
		return nodeToInsert;
	}
}

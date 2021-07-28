package com.hacker_rank.data_structures.linkedlist;

public class _07_ReverseList {

	public Node reverseList(Node node) {
		
//		if (node == null || node.next == null) {
//			
//			return node;
//		}
//		
//		Node previous = null, next = node.next;
//		
//		while(node != null) {
//			
//			node.next = previous;
//			previous = node;
//			node = next;
//			if (next == null) {
//				
//				break;
//			}
//			next = next.next;
//		}
//		
//		return node;
		
		if (node == null) {
			
			return node;
		}
		
		reverseList(node.next);
		node.next.next = node;
		
		return node;
	}
}

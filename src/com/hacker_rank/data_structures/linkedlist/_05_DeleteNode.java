package com.hacker_rank.data_structures.linkedlist;

public class _05_DeleteNode {

	
	public Node deleteNode(final Node node, final int position) {
		
		Node temp1 = node;
		
		if (position == 0) {
			
			return node.next;
		}
		
		int index = 0;
		while(temp1.next != null) {
			
			if (index == position - 1) {
				
				break;
			}
			
			temp1 = temp1.next;
			index ++;
		}
		
		temp1.next = temp1.next.next;
		
		
		return node;
	}
}

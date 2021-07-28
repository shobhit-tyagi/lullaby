package com.hacker_rank.data_structures.linkedlist;

public class _13_MergePoint {

	public int mergePoint(Node list1, Node list2) {
		
		Node tempList1 = list1, tempList2 = list2;
		
		while(tempList1 != tempList2) {
			
			if (tempList1.next == null) {
				
				tempList1 = list2;
			} else {
				
				tempList1 = tempList1.next;
			}
			
			if (tempList2.next == null) {
				
				tempList2 = list1;
			} else {
				
				tempList2 = tempList2.next;
			}
		}
		
		return tempList1.data;
	}
}

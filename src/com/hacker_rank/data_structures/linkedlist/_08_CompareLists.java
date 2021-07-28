package com.hacker_rank.data_structures.linkedlist;

public class _08_CompareLists {

	public boolean compareLists(Node list1, Node list2) {
		
		while(list1 != null) {
			
			if (list2 == null || list1.data != list2.data) {
				
				return false;
			}
			
			list1 = list1.next;
			list2 = list2.next;
		}
		
		if (list2 != null) {
			
			return false;
		}
		return true;
	}
}

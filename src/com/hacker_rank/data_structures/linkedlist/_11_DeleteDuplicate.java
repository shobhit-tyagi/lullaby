package com.hacker_rank.data_structures.linkedlist;

public class _11_DeleteDuplicate {

	public Node deleteDuplicateFromSortedList(final Node head) {

        Node current = head;

        while(current.next != null) {

            if (current.data == current.next.data) {

                Node temp = current.next;
                current.next = current.next.next;
                temp.next = null;
            } else {

                current = current.next;
            }
        }

        return head;
    }    
}

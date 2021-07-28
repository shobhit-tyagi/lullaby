package com.hacker_rank.data_structures.linkedlist;

public class _10_ValueFromTail {

	 public int NodeValueFromTail(Node head, int N) {

        Node tailPointer = head;
        while(N != 0) {

            tailPointer = tailPointer.next;
            N --;
        }

        while(tailPointer.next != null) {

            tailPointer = tailPointer.next;
            head = head.next;
        }

        return head.data;
    }
}

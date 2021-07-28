package com.hacker_rank.data_structures.linkedlist;

public class _12_CycleDetection {

	 public boolean detectCycle(final Node head) {

        if (head == null || head.next == null) {

            return false;
        }
        Node slow = head, fast = head.next.next;
        while(fast != null && fast.next != null) {

            if (slow == fast) {

                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}

package com.hacker_rank.data_structures.linkedlist;

public class _09_MergeSortedLists {

	public Node mergeSortedLists(Node list1, Node list2) {

        Node mergedListHead = null;
        Node nodeToLink = null;
        while(list1 != null && list2 != null) {

            if (list1.data < list2.data) {

                if (nodeToLink != null) {
                    nodeToLink.next = list1;
                    nodeToLink = nodeToLink.next;
                } else {
                    nodeToLink = list1;
                }

                list1 = list1.next;
            } else {

                if (nodeToLink != null) {
                    nodeToLink.next = list2;
                    nodeToLink = nodeToLink.next;
                } else {
                    nodeToLink = list2;
                }
                list2 = list2.next;
            }

            if (mergedListHead == null) {

                mergedListHead = nodeToLink;
            }
        }

        if (list1 != null) {

            if (nodeToLink == null) {

                nodeToLink = list1;
            } else {

                nodeToLink.next = list1;
            }
        } else {

            if (nodeToLink == null) {

                nodeToLink = list2;
            } else {

                nodeToLink.next = list2;
            }
        }

        return mergedListHead;
    }
}

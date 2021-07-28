package com.hacker_rank.data_structures.linkedlist;

public class LinkedList {

	public static void Print(Node head) {
		if (head == null) {
			return;
		}
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static Node InsertTail(Node head, int data) {
		Node nodeToInsert = new Node();
		nodeToInsert.data = data;
		nodeToInsert.next = null;
		if (head == null) {
			head = nodeToInsert;
			return head;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = nodeToInsert;
		return head;
	}

	public static Node InsertHead(Node head, int data) {
		Node nodeToInsert = new Node();
		nodeToInsert.data = data;
		nodeToInsert.next = null;
		if (head == null) {
			head = nodeToInsert;
			return head;
		}
		nodeToInsert.next = head;
		return nodeToInsert;
	}

	public static Node InsertNth(Node head, int data, int position) {
		Node nodeToInsert = new Node();
		nodeToInsert.data = data;
		nodeToInsert.next = null;

		if (position == 0) {
			nodeToInsert.next = head;
			return nodeToInsert;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			if (temp.next == null) {
				temp.next = nodeToInsert;
				return head;
			}
			temp = temp.next;
		}
		Node temp1 = temp.next;
		temp.next = nodeToInsert;
		nodeToInsert.next = temp1;
		return head;
	}

	public static Node Delete(Node head, int position) {
		if (position == 0) {
			return head.next;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
			if (temp.next == null) {
				temp = null;
				return head;
			}
		}
		temp.next = temp.next.next;
		return head;
	}

	public static void ReversePrint(Node head) {
		if (head == null) {
			return;
		}

		ReversePrint(head.next);
		System.out.println(head.data);
	}

	public static Node Reverse(Node head) {
		if (head == null) {
			return null;
		}

		Node previous = null;
		Node next = head.next;
		while (head != null) {
			head.next = previous;
			previous = head;
			head = next;
			if (next == null) {
				break;
			}
			next = next.next;
		}

		return previous;
	}

	public static int CompareLists(Node headA, Node headB) {
		while (headA != null && headB != null) {
			if (headA.data != headB.data) {
				return 0;
			}
			headA = headA.next;
			headB = headB.next;
		}

		if (headA != null || headB != null) {
			return 0;
		} else {
			return 1;
		}
	}

	public static Node MergeLists(Node headA, Node headB) {
		Node headC = null;
		Node headCReturn = null;
		while (headA != null && headB != null) {
			Node nodeToInsert = new Node();
			nodeToInsert.next = null;
			if (headA.data >= headB.data) {
				nodeToInsert.data = headB.data;
				headB = headB.next;
			} else {
				nodeToInsert.data = headA.data;
				headA = headA.next;
			}

			if (headC == null) {
				headC = nodeToInsert;
				headCReturn = headC;
			} else {
				headC.next = nodeToInsert;
				headC = headC.next;
			}
		}

		if (headA == null) {
			if (headC == null) {
				headC = headB;
				headCReturn = headC;
			} else {
				headC.next = headB;
			}
		} else if (headB == null) {
			if (headC == null) {
				headC = headA;
				headCReturn = headC;
			} else {
				headC.next = headA;
			}
		}

		return headCReturn;
	}

	public static int GetNode(Node head, int n) {
		int returnData = 0;

		Node temp = head;
		while (head != null) {
			if (n > 0) {
				n--;
			} else {
				returnData = temp.data;
				temp = temp.next;
			}

			head = head.next;
		}

		return returnData;
	}

	public static Node RemoveDuplicates(Node head) {
		Node temp = head;

		while (temp.next != null) {
			if (temp.data == temp.next.data) {
				Node temp1 = temp.next.next;
				temp.next.next = null;
				temp.next = temp1;
			} else {
				temp = temp.next;
			}
		}

		return head;
	}

	public static int HasCycle(Node head) {
		Node temp1 = head;
		Node temp2 = head;

		while (temp1 != null && temp2 != null) {
			temp1 = temp1.next;
			if (temp2.next == null) {
				return 0;
			}
			temp2 = temp2.next.next;
			if (temp1 == temp2) {
				return 1;
			}

		}
		return 0;
	}

	public static int FindMergeNode(Node headA, Node headB) {
		Node tempA = headA;
		Node tempB = headB;
		int lengthA = 0, lengthB = 0;
		while(tempA != null) {
			tempA = tempA.next;
			lengthA ++;
		}
		while(tempB != null) {
			tempB = tempB.next;
			lengthB ++;
		}
		
		while(lengthA != lengthB) {
			if(lengthA > lengthB) {
				headA = headA.next;
				lengthA --;
			} else {
				headB = headB.next;
				lengthB --;
			}
		}
		
		while(headA != null && headB != null) {
			if(headA == headB) {
				return headA.data;
			}
		}
		
		return 0;
	}
}

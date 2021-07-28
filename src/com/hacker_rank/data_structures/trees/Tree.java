package com.hacker_rank.data_structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {

	public static void Preorder(Node root) {

		if (root != null) {
			System.out.print(root.data);
			System.out.print(" ");
			Preorder(root.left);
			Preorder(root.right);
		}
	}

	public static void Postorder(Node root) {
		if (root != null) {
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data);
			System.out.print(" ");
		}
	}

	public static void Inorder(Node root) {
		if (root != null) {
			Inorder(root.left);
			System.out.print(root.data);
			System.out.print(" ");
			Inorder(root.right);
		}
	}

	public static int Height(Node root) {
		if (root == null) {
			return 0;
		}
		return (1 + Math.max(Height(root.left), Height(root.right)));
	}

	public static void TopView(Node root) {

		TopViewHelper(root.left, true);
		System.out.print(root.data);
		System.out.print(" ");
		TopViewHelper(root.right, false);
	}

	private static void TopViewHelper(Node root, boolean flag) {
		if (root != null) {
			if (flag) {
				TopViewHelper(root.left, flag);
				System.out.print(root.data);
				System.out.print(" ");
			} else {
				System.out.print(root.data);
				System.out.print(" ");
				TopViewHelper(root.right, flag);
			}
		}
	}

	public static void LevelOrder(Node root) {
		Queue<Node> temp = new LinkedList<Node>();
		temp.add(root);
		while (!temp.isEmpty()) {
			Node n = temp.poll();
			System.out.print(n.data);
			System.out.print(" ");
			if (n.left != null) {
				temp.add(n.left);
			}
			if (n.right != null) {
				temp.add(n.right);
			}
		}
	}

	public static Node InsertBST(Node root, int value) {
		if (root == null) {
			Node nodeToInsert = new Node();
			nodeToInsert.data = value;
			nodeToInsert.left = null;
			nodeToInsert.right = null;
			root = nodeToInsert;
		} else if (root.data > value) {
			root.left = InsertBST(root.left, value);
		} else if (root.data < value) {
			root.right = InsertBST(root.right, value);
		}

		return root;
	}

	public static void HuffmanDecode(String S, Node root) {
		int index = 0;
		Node temp = root;
		while (index < S.length()) {
			if (S.charAt(index) == '0') {
				temp = temp.left;
				index++;
			} else if (S.charAt(index) == '1') {
				temp = temp.right;
				index++;
			}
            
            if (temp.left == null && temp.right == null) {
				System.out.print(temp.data);
				temp = root;
			}
		}
	}
	
	public static Node lca(Node root,int v1,int v2) {
		Node temp1 = root;
		Node temp2 = root;
		List<Integer> list = new ArrayList<Integer>();
		while(temp1 != null) {
			list.add(temp1.data);
			if(temp1.data == v1) {
				break;
			} else {
				if(temp1.data > v1) {
					temp1 = temp1.left;
				} else {
					temp1 = temp1.right;
				}
			}
		}
		Node temp3 = null;
		while(temp2 != null) {
			if(list.contains(temp2.data)) {
				temp3 = temp2;
				if(temp2.data > v2) {
					temp2 = temp2.left;
				} else {
					temp2 = temp2.right;
				}
			} else {
				break;
			}
		}
		return temp3;
    }
}

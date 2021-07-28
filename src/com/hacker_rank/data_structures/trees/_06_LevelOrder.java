package com.hacker_rank.data_structures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class _06_LevelOrder {

	public void levelOrder(Node tree) {
		
		Queue<Node> temp = new LinkedList<Node>();
		temp.add(tree);
		
		while(!temp.isEmpty()) {
			
			Node n = temp.poll();
			
			System.out.print(n.data + " ");
			if (n.left != null) {
				
				temp.add(n.left);
			}
			
			if (n.right != null) {
				
				temp.add(n.right);
			}
		}
	}
}

package com.hacker_rank.data_structures.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Problem Statement

You have an empty sequence, and you will be given N queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
Input Format

The first line of input contains an integer, N. The next N lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Constraints 
1<=N<=105 
1<=x<=109 
1<=type<=3
Output Format

For each type 3 query, print the maximum element in the stack on a new line.
 */
public class _01_MaximumElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int topIndex = -1;
		int max = 0;
		List<Integer> stack = new ArrayList<Integer>();
		while(N > 0) {
			String [] query = br.readLine().split("\\ ");
			if(query[0].equals("1")) {
				if(Integer.parseInt(query[1]) > max || stack.isEmpty()) {
					max = Integer.parseInt(query[1]);
				}
				stack.add(Integer.parseInt(query[1]));
				topIndex ++;
			} else if(query[0].equals("2")) {
				int el = stack.remove(topIndex);
				if(el == max) {
					max = reCalculateListMax(stack);
				}
				topIndex --;
			} else if(query[0].equals("3")) {
				System.out.println(max);
			}
			N --;
		}
	}
	
	private static int reCalculateListMax(List<Integer> stack) {
		int max = 0;
		if(!stack.isEmpty()) {
			max = stack.get(0);
		}
		for(Integer temp : stack) {
			if(temp > max) {
				max = temp;
			}
		}
		return max;
	}
}

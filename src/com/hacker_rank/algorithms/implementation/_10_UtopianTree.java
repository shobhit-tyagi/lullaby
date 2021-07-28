package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after N growth cycles?

Input Format

The first line contains an integer, T, the number of test cases. 
T subsequent lines each contain an integer, N, denoting the number of cycles for that test case.

Constraints 
1<=T<=10 
0<=N<=60
Output Format

For each test case, print the height of the Utopian Tree after N cycles. Each height must be printed on a new line.
*/
public class _10_UtopianTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T > 0) {
			int N = Integer.parseInt(in.readLine());
			int height = 1; // Initial height
			int r = N % 2;
			int q = N / 2;
			while(q > 0) {
				height = height * 2;
				height = height + 1;
				q --;
			}
			if(r == 1) {
				height = height * 2;
			}
			System.out.println(height);
			
			T --;
		}
		
	}
}

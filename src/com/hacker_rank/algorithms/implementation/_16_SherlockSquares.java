package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Problem Statement

Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format 
The first line contains T, the number of test cases. T test cases follow, each in a new line. 
Each test case contains two space-separated integers denoting A and B.

Output Format 
For each test case, print the required answer in a new line.

Constraints 
1<=T<=100 
1<=A<=B<=109
 */
public class _16_SherlockSquares {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String [] input = in.readLine().split("\\ ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			int maxPosible = (int) Math.sqrt(B); 
			int minPosible = (int) Math.sqrt(A); 
			if(minPosible*minPosible < A) {
				minPosible ++;
			}
			System.out.println(maxPosible - minPosible + 1);
			T --;
		}
	}
}

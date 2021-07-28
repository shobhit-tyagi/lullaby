package com.hacker_rank.data_structures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

An array is a series of elements of the same type placed in contiguous memory locations that can be individually referenced by adding an index to a unique identifier.

You'll be given an array of N integers, and you have to print the integers in reverse order.

Note: If you have already solved the problem "Arrays Introduction" in the Introduction chapter of the C++ domain, you may skip this challenge.

Input Format

The first line of input contains N, the number of integers. The next line contains N integers separated by a space.

Constraints

1<=N<=1000
1<=Ai<=10000, where Ai is the ith integer in the array.

Output Format

Print the N integers of the array in the reverse order on a single line separated by single spaces.
 */
public class _01_ArraysDS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String input[] = in.readLine().split("\\ ");
		
		for(int i = N - 1; i >= 0; i --) {
			System.out.print(input[i]);
			System.out.print(" ");
		}
		
	}
}

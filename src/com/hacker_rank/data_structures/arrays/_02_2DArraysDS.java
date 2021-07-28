package com.hacker_rank.data_structures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem, you have to print the largest sum among all the hourglasses in the array.

Note: If you have already solved the problem "Java 2D array" in the data structures chapter of the Java domain, you may skip this challenge.

Input Format

There will be exactly 6 lines of input, each containing 6 integers separated by spaces. Each integer will be between -9 and 9, inclusively.

Output Format

Print the answer to this problem on a single line.
 */
public class _02_2DArraysDS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] input = new int [6][6];
		for(int i = 0; i < 6; i ++) {
			String [] row = in.readLine().split("\\ ");
			for(int j = 0; j < 6; j ++) {
				input[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 4; j ++) {
				int sum = 0;
				sum = sum + input[i][j];
				sum = sum + input[i][j + 1];
				sum = sum + input[i][j + 2];
				sum = sum + input[i + 1][j + 1];
				sum = sum + input[i + 2][j];
				sum = sum + input[i + 2][j + 1];
				sum = sum + input[i + 2][j + 2];
				
				if(i == 0 && j == 0) {
					max = sum;
				} else if(sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}

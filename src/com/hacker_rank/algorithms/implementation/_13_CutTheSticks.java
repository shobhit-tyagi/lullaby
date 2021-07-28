package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8
Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:

3 2 2 6
The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer N. 
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.
*/
public class _13_CutTheSticks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(in.readLine());
		String []sticks = in.readLine().split("\\ ");
		int lowest = 0;
		while(true) {
			int total = 0;
			int nextLowest = 0;
			for(int i = 0; i < sticks.length; i ++) {
				int stickInt = Integer.parseInt(sticks[i]);
				int newValStickInt = stickInt - lowest;
				if(newValStickInt > 0) {
					if(nextLowest == 0) {
						nextLowest = newValStickInt;
					}
					total ++;
				}
				if(newValStickInt < nextLowest && newValStickInt > 0) {
					nextLowest = newValStickInt;
				}
				sticks[i] = newValStickInt+"";
			}
			lowest = nextLowest;
			if(total <= 0) {
				break;
			}
			System.out.println(total);
		}
	}
}

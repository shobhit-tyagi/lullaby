package com.hacker_rank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
This is a simple challenge to get things started. Given a sorted array (ar) and a number (V), can you print the index location of V in the array?

The next section describes the input format. You can often skip it, if you are using included methods.

Input Format 
There will be three lines of input:

V - the value that has to be searched.
n - the size of the array.
ar - n numbers that make up the array.
Output Format 
Output the index of V in the array.
 */
public class _01_StartupChallenge {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		String []input = in.readLine().split("\\ ");
		for(int i = 0; i < n; i ++) {
			if(Integer.parseInt(input[i]) == V) {
				System.out.println(i);
				break;
			}
		}
	}
}

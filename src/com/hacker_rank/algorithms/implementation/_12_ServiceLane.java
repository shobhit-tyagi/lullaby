package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Given an integer, N, traverse its digits (d1,d2,...,dn) and determine how many digits evenly divide N (i.e.: count the number of times N divided by each digit di has a remainder of 0). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111, the answer is 3).

Input Format

The first line is an integer, T, indicating the number of test cases. 
The T subsequent lines each contain an integer, N.

Constraints 
1<=T<=15 
0<N<1010
Output Format

For every test case, count and print (on a new line) the number of digits in N that are able to evenly divide N.
*/
public class _12_ServiceLane {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			int numOfDigits = 0;
			long N = Long.parseLong(in.readLine());
			long temp = N;
			
			while(temp != 0) {
				int r = (int) (temp % 10);
				temp = temp / 10;
				
				if(r != 0 && N % r == 0) {
					numOfDigits ++;
				}
			}
			System.out.println(numOfDigits);
			
			T --;
		}
	}
}

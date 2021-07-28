package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Little Bob loves chocolate, and he goes to a store with $N in his pocket. The price of each chocolate is $C. The store offers a discount: for every M wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

Input Format: 
The first line contains the number of test cases, T. 
T lines follow, each of which contains three integers, N, C, and M.

Output Format: 
Print the total number of chocolates Bob eats.
*/
public class _14_ChocolateFeast {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T > 0) {
			String []input = in.readLine().split("\\ ");
			int N = Integer.parseInt(input[0]);
			int C = Integer.parseInt(input[1]);
			int M = Integer.parseInt(input[2]);
			int numOfChocs = N / C;
			int numOfWraps = numOfChocs;
			while(numOfWraps - M >= 0) {
				numOfWraps = numOfWraps - M + 1;
				numOfChocs ++;
			}
			
			System.out.println(numOfChocs);
			T --;
		}
	}
}

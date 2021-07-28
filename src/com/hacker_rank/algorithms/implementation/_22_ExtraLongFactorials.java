package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Problem Statement

You are given an integer N. Print the factorial of this number.

N!=N×(N - 1)×(N - 2)×...×3×2×1
Input 
Input consists of a single integer N, where 1<=N<=100.

Output 
Print the factorial of N.

Example 
For an input of 25, you would print 15511210043330985984000000.

Note: Factorials of N>20 can't be stored even in a 64 - bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.
 */
public class _22_ExtraLongFactorials {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		BigInteger sum = BigInteger.valueOf(1);
		while(N > 0) {
			sum = sum.multiply(BigInteger.valueOf(N --));
		}
		
		System.out.println(sum);
	}
}

package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Suppose you have a string S that has the length N. It is indexed from 0 to N-1. String R is the reverse of string S. The string S is funny if the condition |Si-Si-1|=|Ri-Ri-1| is true for every i from 1 to N-1.

Note: Given a string str, stri denotes the ascii value of the ith character (0-indexed) of str. Here, |x| denotes the absolute value of an integer x.

Input Format

The first line of input will contain an integer T, the number of test cases. Each of the next T lines contains one string S.

Constraints

1<=T<=10
2<=length of S<=10000
Output Format

For each string, print Funny or Not Funny on separate lines.
 */
public class _02_FunnyStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T > 0) {
			String S = in.readLine();
			int length = S.length();
			int i = 0, j = length - 1;
			boolean flag = true;
			while(i < j) {
				if(!(Math.abs(S.charAt(i + 1) - S.charAt(i)) == Math.abs(S.charAt(j - 1) - S.charAt(j)))) {
					flag = false;
					break;
				}
				
				i ++;
				j --;
			}
			System.out.println(flag ? "Funny" : "Not Funny");
			T --;
		}
	}
}

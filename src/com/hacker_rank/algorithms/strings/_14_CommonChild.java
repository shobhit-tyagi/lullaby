package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Given two strings a and b of equal length, what's the longest string (S) that can be constructed such that it is a child of both? 

A string x is said to be a child of a string y if x can be formed by deleting 0 or more characters from y. 

For example, ABCD and ABDC has two children with maximum length 3, ABC and ABD. Note that we will not consider ABCD as a common child because C doesn't occur before D in the second string.

Input format

Two strings, a and b, with a newline separating them.

Constraints

All characters are upper cased and lie between ASCII values 65-90. The maximum length of the strings is 5000.

Output format

Length of string S.
 */
public class _14_CommonChild {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String a = in.readLine();
		String b = in.readLine();
		
		System.out.println(longestCommonSubsequence(a, b));
	}

	public static int longestCommonSubsequence(String a, String b) {
	    int lenA = a.length();
	    int lenB = b.length();
	    int[][] matrix = new int[lenA + 1][lenB + 1];

	    for (int i = 1; i <= lenA; i ++) {
	        for (int j = 1; j <= lenB; j ++) {
	            if (a.charAt(i - 1) == b.charAt(j - 1)) {
	            	matrix[i][j] = matrix[i - 1][j - 1] + 1;
	            } else {
	            	int max = Math.max(matrix[i-1][j], matrix[i][j-1]);
	            	matrix[i][j] = max;
	            }
	        }
	    }
	    return matrix[lenA][lenB];
	}
	
}

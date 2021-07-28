package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Jack and Daniel are friends. Both of them like letters, especially upper-case ones. 
They are cutting upper-case letters from newspapers, and each one of them has their collection of letters stored in separate stacks. 
One beautiful day, Morgan visited Jack and Daniel. He saw their collections. Morgan wondered what is the lexicographically minimal string, made of that two collections. He can take a letter from a collection when it is on the top of the stack. 
Also, Morgan wants to use all the letters in the boys' collections.

Input Format

The first line contains the number of test cases, T. 
Every next two lines have such format: the first line contains string A, and the second line contains string B.

Constraints 
1<=T<=5 
1<=|A|<=105 
1<=|B|<=105 
A and B contain upper-case letters only.

Output Format

Output the lexicographically minimal string S for each test case in new line.
 */
public class _13_MorganAndString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String A = in.readLine();
			String B = in.readLine();
			StringBuilder strBld = new StringBuilder();
			while(A.length() > 0 && B.length() > 0) {
				int smaller = findSmallerString(A, B);
				if(smaller == -1) {
					strBld.append(A.charAt(0));
					A = A.substring(1, A.length());
				} else {
					strBld.append(B.charAt(0));
					B = B.substring(1, B.length());
				}
			}
			if(A.length() > 0)
				strBld.append(A);
			else if(B.length() > 0)
				strBld.append(B);
			
			System.out.println(strBld.toString());
			T --;
		}
	}

	private static int findSmallerString(String A, String B) {
		int index = 0;
		while(index < A.length() && index < B.length()) {
			if(A.charAt(index) > B.charAt(index)) {
				return 1;
			} else if(A.charAt(index) < B.charAt(index)) {
				return -1;
			} else {
				index ++;
			}
		}
		if(index == A.length()) {
			return 1;
		} else {
			return -1;
		}
	}
}

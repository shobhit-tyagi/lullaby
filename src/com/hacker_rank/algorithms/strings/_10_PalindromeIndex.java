package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given a string of lower case letters. Your task is to figure out the index of the character on whose removal it will make the string a palindrome. There will always be a valid solution. 

In case the string is already a palindrome, then -1 is also a valid answer along with possible indices.

Input Format

The first line contains T, i.e. the number of test cases.
T lines follow, each containing a string.

Output Format

Print the position (0 index) of the letter by removing which the string turns into a palindrome. For a string, such as

bcbc
we can remove b at index 0 or c at index 3. Both answers are accepted.
 */
public class _10_PalindromeIndex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String input = in.readLine();
			int length = input.length();
			int index1 = 0;
			int index2 = length - 1;
			boolean flag = true;
			while(index1 < index2) {
				if(input.charAt(index1) != input.charAt(index2)) {
					flag = false;
					if(input.substring(index1 + 1, length/2 + 1).equals(input.substring(length/2, index2))) {
						System.out.println(index1);
					} else {
						System.out.println(index2);
					}
					break;
				}
				index2 --;
				index1 ++;
			}
			if(flag) {
				System.out.println(-1);
			}
			
			T --;
		}
	}
}

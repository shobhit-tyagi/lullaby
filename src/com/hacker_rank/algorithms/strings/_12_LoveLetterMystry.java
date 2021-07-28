package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

Input Format

The first line contains an integer T, i.e., the number of test cases. 
The next T lines will contain a string each. The strings do not contain any spaces.

Constraints 
1<=T<=10 
1<= length of string <=104 
All characters are lower case English letters.

Output Format

A single line containing the number of minimum operations corresponding to each test case.
 */
public class _12_LoveLetterMystry {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String input = in.readLine();
			int numOfOperations = 0;
			int start = 0, end = input.length() - 1;
			while(start <= end) {
				numOfOperations = numOfOperations + Math.abs(input.charAt(start) - input.charAt(end));
				start ++;
				end --;
			}
			
			System.out.println(numOfOperations);
			T --;
		}
	}
}

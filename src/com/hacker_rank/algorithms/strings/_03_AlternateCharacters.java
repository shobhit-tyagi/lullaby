package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases. 
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints

1<=T<=10 
1<= length of string <=105
 */
public class _03_AlternateCharacters {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String input = in.readLine();
			int originalLength = input.length();
			while(true) {
				int tempLength = input.length();
				input = input.replaceAll("[A]+", "A");
				input = input.replaceAll("[B]+", "B");
				if(input.length() == tempLength) {
					break;
				}
			}
			System.out.println(originalLength - input.length());
			T --;
		}
	}
}

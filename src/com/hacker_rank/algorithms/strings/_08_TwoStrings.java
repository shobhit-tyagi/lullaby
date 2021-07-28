package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given two strings, A and B. Find if there is a substring that appears in both A and B.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer T, the number of test cases.

Then there will be T descriptions of the test cases. Each description contains two lines. The first line contains the string A and the second line contains the string B.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.
1<=T<=10
1<=|A|,|B|<=105
 */
public class _08_TwoStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			boolean flag = false;
			boolean []alphabets = new boolean[26];
			String input1 = in.readLine();
			int index = 0;
			while(index < input1.length()) {
				alphabets[input1.charAt(index) - 97] = true;
				index ++;
			}
			
			String input2 = in.readLine();
			index = 0;
			while(index < input2.length()) {
				if(alphabets[input2.charAt(index) - 97]) {
					flag = true;
					break;
				}
				index ++;
			}
			if(flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
			T --;
		}
	}
}

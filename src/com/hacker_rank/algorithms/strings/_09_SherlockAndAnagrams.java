package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Given a string S, find the number of "unordered anagrammatic pairs" of substrings.

Input Format

First line contains T, the number of testcases. Each testcase consists of string S in one line.

Constraints 
1<=T<=10 
2<=length(S)<=100 
String S contains only the lowercase letters of the English alphabet.

Output Format

For each testcase, print the required answer in one line.
 */
public class _09_SherlockAndAnagrams {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String input1 = in.readLine();
			int sum = 0;
			int subSize = 0;
			int length = input1.length();
			
			while(subSize < length) {
				int index1 = 0;
				while(subSize + index1 < length) {
					String strToMatch = input1.substring(index1, subSize + index1 + 1);
					int index2 = index1 + 1;
					while(subSize + index2 < length) {
						String tempStr = input1.substring(index2, subSize + index2 + 1);
						if(checkAnagram(strToMatch, tempStr)) {
							sum ++;
						}
						index2 ++;
					}
					index1 ++;
				}
				subSize ++;
			}
			
			System.out.println(sum);
			T --;
		}
	}

	private static boolean checkAnagram(String strToMatch, String tempStr) {
		int []alphabets = new int[26];
		for(int i = 0; i < strToMatch.length(); i ++) {
			alphabets[strToMatch.charAt(i) - 97] ++;
		}
		
		for(int i = 0; i < tempStr.length(); i ++) {
			if(alphabets[tempStr.charAt(i) - 97] != 0) {
				alphabets[tempStr.charAt(i) - 97] --;
			}
		}
		for(int i = 0; i < 26; i ++) {
			if(alphabets[i] > 0) {
				return false;
			}
		}
		
		return true;
	}
}

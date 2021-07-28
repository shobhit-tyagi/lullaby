package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

Input Format 
Two lines each containing a string.

Constraints 
1 <= Length of A,B <= 10000 
A and B will only consist of lowercase latin letter.

Output Format 
A single integer which is the number of character deletions.
 */
public class _06_MakeAnagram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input1 = in.readLine();
		String input2 = in.readLine();
		int []alphabets1 = new int[26];
		int []alphabets2 = new int[26];
		
		int index = 0;
		while(index < input1.length()) {
			alphabets1[input1.charAt(index) - 97] ++;
			index ++;
		}
		index = 0;
		while(index < input2.length()) {
			alphabets2[input2.charAt(index) - 97] ++;
			index ++;
		}
		
		int sum = 0;
		for(int i = 0; i < 26; i ++) {
			sum = sum + Math.abs(alphabets1[i] - alphabets2[i]);
		}
		
		System.out.println(sum);
	}
}

package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

door

But, to lock the door he needs a key that is an anagram of a certain palindrome string.

The king has a string composed of lowercase English letters. Help him figure out whether any anagram of the string can be a palindrome or not.

Input Format 
A single line which contains the input string.

Constraints 
1<= length of string <=105 
Each character of the string is a lowercase English letter.

Output Format 
A single line which contains YES or NO in uppercase.
 */
public class _04_GameOfThrones1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		
		int []alphabets = new int [26];
		int index = 0;
		while(index < input.length()) {
			if(alphabets[input.charAt(index) - 97] == 0) {
				alphabets[input.charAt(index) - 97] ++;
			} else {
				alphabets[input.charAt(index) - 97] --;
			}
			
			index ++;
		}
		int sum = 0;
		for(int temp : alphabets) {
			sum += temp;
		}
		if(sum == 0)
			System.out.println("YES");
		else if(sum == 1 && input.length() % 2 != 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format Input consists of a line containing s.

Constraints 
Length of s can be at most 103 (1<=|s|<=103) and it may contain spaces, lower case and upper case letters. Lower case and upper case instances of a letter are considered the same.

Output Format Output a line containing pangram if s is a pangram, otherwise output not pangram.
 */
public class _01_Pangrams {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		boolean []b = new boolean[26];
		s = s.toUpperCase();
		int index = 0;
		int total = 0;
		while(index < s.length()) {
			if(s.charAt(index) != ' ') {
				int charNum = s.charAt(index) - 65;
				if(!b[charNum]) {
					b[charNum] = true;
					total ++;
				}
			}
			index ++;
		}
		
		if(total == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}
}

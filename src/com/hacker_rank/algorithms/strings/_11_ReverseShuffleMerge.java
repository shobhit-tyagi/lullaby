package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.sampled.ReverbType;

/*
Problem Statement

Given a string, S, we define some operations on the string as follows:

a. reverse(S) denotes the string obtained by reversing string S. E.g.: reverse("abc") = "cba"

b. shuffle(S) denotes any string that's a permutation of string S. E.g.: shuffle("god") => ['god', 'gdo', 'ogd', 'odg', 'dgo', 'dog']

c. merge(S1,S2) denotes any string that's obtained by interspersing the two strings S1 & S2, maintaining the order of characters in both. 
E.g.: S1 = "abc" & S2 = "def", one possible result of merge(S1,S2) could be "abcdef", another could be "abdecf", another could be "adbecf" and so on.

Given a string S such that S=> merge(reverse(A), shuffle(A)), for some string A, can you find the lexicographically smallest A?

Input Format

A single line containing the string S.

Constraints: 
S contains only lower-case English letters.
The length of string S is less than or equal to 10000.

Output Format

A string which is the lexicographically smallest valid A.
 */
public class _11_ReverseShuffleMerge {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		
		String S_Reverse = reverse(S);
		String S_Shuffle = reverse(S);
	}
	
	private static String shuffle(String input) {
		return null;
	}
	
	private static String reverse(String input) {
		return null;
	}
	
	private static String merge(String input1, String input2) {
		return null;
	}
}

package com.hacker_rank.java.strings;

import java.util.Scanner;

/*
Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
 */

public class _02_JavaSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		
		String smallest = str.substring(0, k);
		String largest = str.substring(0, k);
		
		for (int i = 1; i < str.length() - k + 1; i ++) {
			
			String temp = str.substring(i, k + i);
			if (compareString(smallest, temp)) {
				
				smallest = temp;
			}
			
			if (compareString(temp, largest)) {
				
				largest = temp;
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		sc.close();
	}

	private static boolean compareString(String string1, String string2) {

		for (int i = 0; i < string1.length(); i ++) {
			
			if (string1.charAt(i) < string2.charAt(i)) {
				
				return false;
			} else if (string1.charAt(i) > string2.charAt(i)) {
				
				return true;
			}
		}
		
		return false;
	}
}

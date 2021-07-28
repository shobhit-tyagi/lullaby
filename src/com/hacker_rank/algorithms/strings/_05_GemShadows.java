package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
Problem Statement

John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.

Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer, N, the number of rocks. 
Each of the next N lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints 
1<=N<=100 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
1<= length of each composition <=100
Output Format

Print the number of gem-elements that are common in these rocks. If there are none, print 0.
 */
public class _05_GemShadows {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String input1 = in.readLine();
		HashSet<Character> h1 = new HashSet<Character>();
		
		for(int i = 0; i < input1.length(); i ++) {
			h1.add(input1.charAt(i));
		}
		
		while(N > 1) {
			HashSet<Character> h2 = new HashSet<Character>();
			String input2 = in.readLine();
			for(int i = 0; i < input2.length(); i ++) {
				h2.add(input2.charAt(i));
			}
			h1.retainAll(h2);
			N --;
		}
		System.out.println(h1.size());
	}
}

package com.hacker_rank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books. He chooses strings S1 and S2 in such a way that |len(S1)-len(S2)|<=1.

Your task is to help him find the minimum number of characters of the first string he needs to change to enable him to make it an anagram of the second string.

Note: A word x is an anagram of another word y if we can produce y by rearranging the letters of x.

Input Format 
The first line will contain an integer, T, representing the number of test cases. Each test case will contain a string having length len(S1)+len(S2), which will be concatenation of both the strings described above in the problem.The given string will contain only characters from a to z.

Output Format 
An integer corresponding to each test case is printed in a different line, i.e. the number of changes required for each test case. Print -1 if it is not possible.

Constraints

1<=T<=100 
1<=len(S1)+len(S2)<=104
 */
public class _07_Anagram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		
		while(T > 0) {
			String input = in.readLine();
			int length = input.length();
			if(length % 2 != 0) {
				System.out.println(-1);
			} else {
				int []alphabets = new int[26];
				String S1 = input.substring(0, length / 2);
				String S2 = input.substring(length / 2, length);
				for(int i = 0; i < S1.length(); i ++) {
					alphabets[S1.charAt(i) - 97] ++;
				}
				
				for(int i = 0; i < S2.length(); i ++) {
					if(alphabets[S2.charAt(i) - 97] != 0) {
						alphabets[S2.charAt(i) - 97] --;
					}
				}
				int sum = 0;
				for(int i = 0; i < 26; i ++) {
					sum = sum + alphabets[i];
				}
				
				System.out.println(sum);
			}
			T --;
		}
	}
}

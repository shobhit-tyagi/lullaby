package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Problem Statement

Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, K, making it unreadable by his enemies. Given a string, S, and a number, K, encrypt S and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains an integer, N, which is the length of the unencrypted string. 
The second line contains the unencrypted string, S. 
The third line contains the integer encryption key, K, which is the number of letters to rotate.

Constraints 
1<=N<=100 
0<=K<=100 
S is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.
 */
public class _15_CeaserCipher {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String S = in.readLine();
		int K = Integer.parseInt(in.readLine());
		StringBuilder tempBuilder = null;
		
		for(int i = 0; i < N; i ++) {
			char oldChar = S.charAt(i);
			char newChar = (char)(S.charAt(i) + K);

			if(((int) oldChar >= 65 && (int) oldChar <= 90)) {
				while(((int) newChar) > 90) {
					newChar = (char)(65 + (((int) newChar) - 90 - 1));
				}
				tempBuilder = new StringBuilder(S);
				tempBuilder.setCharAt(i, newChar);
				S = tempBuilder.toString();
			} else if(((int) oldChar >= 97 && (int) oldChar <= 122)) {
				while(((int) newChar) > 122) {
					newChar = (char)(97 + (((int) newChar) - 122 - 1));
				}
				tempBuilder = new StringBuilder(S);
				tempBuilder.setCharAt(i, newChar);
				S = tempBuilder.toString();
			}
		}
		System.out.println(S);
	}
}

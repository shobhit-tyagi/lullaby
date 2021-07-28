package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus; however, he also gives him a clue—a number, N. Sherlock determines the key to removing the virus is to find the largest Decent Number having N digits.

A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!

Constraints
1<=T<=20
1<=N<=100000


Input Format

The first line is an integer, T, denoting the number of test cases.

The T subsequent lines each contain an integer, N, detailing the number of digits in the number.

Output Format

Print the largest Decent Number having N digits; if no such number exists, tell Sherlock by printing -1.
*/
public class _09_SherlockAndBeast {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			int N = Integer.parseInt(in.readLine());
			int num5 = 0; 
			int num3 = 0;
			int q = N / 3; //11; q = 2
			boolean flag = false;
			for(int i = q; i >= 0; i --) {
				num5 = i * 3;
				num3 = N - num5;
				if(num3 % 5 == 0 && num5 % 3 == 0) {
					flag = true;// Yay.. number found.
					break;
				}
			}
			if(flag) {
				for(int i =0; i < num5/3; i ++) {
					System.out.print("555");
				}
				for(int i =0; i < num3; i ++) {
					System.out.print("3");
				}
				System.out.println();
			} else {
				System.out.println("-1");
			}
			
			T --;
		}
	}
}

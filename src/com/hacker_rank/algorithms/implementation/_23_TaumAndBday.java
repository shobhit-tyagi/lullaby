package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy B number of black gifts and W number of white gifts.

The cost of each black gift is X units.
The cost of every white gift is Y units.
The cost of converting each black gift into white gift or vice versa is Z units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

Input Format

The first line will contain an integer T which will be the number of test cases.
There will be T pairs of lines. The first line of each test case will contain the values of integers B and W. Another line of each test case will contain the values of integers X, Y, and Z.

Constraints 
1<=T<=10 
0<=X,Y,Z,B,W<=109
Output Format

T lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.
 */
public class _23_TaumAndBday {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String []input1 = in.readLine().split("\\ ");
			int B = Integer.parseInt(input1[0]);
			int W = Integer.parseInt(input1[1]);
			
			String []input2 = in.readLine().split("\\ ");
			long X = Integer.parseInt(input2[0]);
			long Y = Integer.parseInt(input2[1]);
			long Z = Integer.parseInt(input2[2]);
			if(Y + Z < X) {
				System.out.println((B + W)*Y + B*Z);
			} else if(X + Z < Y){
				System.out.println((B + W)*X + W*Z);
			} else {
				System.out.println(B*X + W*Y);
			}
			
			T --;
		}
	}
}

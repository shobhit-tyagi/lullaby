package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Problem Statement

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order.

Input Format 
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n (the number of stones). The second line contains a, and the third line contains b.

Output Format 
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints 
1<=T<=10 
1<=n,a,b<=103
*/
public class _19_ManasaStones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			int n = Integer.parseInt(in.readLine());
			int a = Integer.parseInt(in.readLine());
			int b = Integer.parseInt(in.readLine());
			
			int min, max;
			if(a >=b) {
				min = b;
				max = a;
			} else {
				min = a;
				max = b;
			}
			
			int temp = (n-1) * min; // minimum possible value.
			List<Integer> posValues = new ArrayList<Integer>();
			for(int i = 0; i < n; i ++) {
				if(!posValues.contains(temp)) {
					posValues.add(temp);
					System.out.print(temp);
					System.out.print(" ");
				}
				temp = temp - min; // remove 1 stone
				temp = temp + max; // add with bigger value
			}
			System.out.println();
			T --;
		}
	}
}

package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.

Input Format

The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N (students in the class) and K (the cancelation threshold). 
The second line contains N space-separated integers (a1,a2,…,aN) describing the arrival times for each student.

Note: Non-positive arrival times (ai<=0) indicate the student arrived early or on time; positive arrival times (ai>0) indicate the student arrived ai minutes late.

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.
*/
public class _08_AngryProfessor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		while(T > 0) {
			String []input1 = in.readLine().split("\\ ");
			int K = Integer.parseInt(input1[1]);
			String []input2 = in.readLine().split("\\ ");
			
			int sumPresent = 0;
			for(String time : input2) {
				if(Integer.parseInt(time) <= 0) {
					sumPresent ++;
				}
			}
			if(sumPresent < K) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			T --;
		}
	}
}

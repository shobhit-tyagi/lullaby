package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input 
You are given an integer N depicting the height of the staircase.

Output 
Print a staircase of height N that consists of # symbols and spaces. 
 */
public class _06_Staircase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < N; j ++) {
				if(i + j < N - 1) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}

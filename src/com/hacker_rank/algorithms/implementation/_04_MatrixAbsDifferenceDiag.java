package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Problem Statement

Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 */
public class _04_MatrixAbsDifferenceDiag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int sumDiag1 = 0;
		int sumDiag2 = 0;
		int i = 0;
		while(i < N) {
			String temp[] = in.readLine().split("\\ ");
			for(int j =0; j < N; j ++) {
				if(i - j == 0) {
					sumDiag1 += Integer.parseInt(temp[j]);
				} 
				if(i + j == N - 1) {
					sumDiag2 += Integer.parseInt(temp[j]);
				} 
			}
			i ++;
		}
		
		System.out.println(Math.abs(sumDiag1 - sumDiag2));
	}
}

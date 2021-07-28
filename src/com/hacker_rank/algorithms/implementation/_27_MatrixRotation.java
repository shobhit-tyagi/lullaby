package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given a 2D matrix, a, of dimension MxN and a positive integer R. You have to rotate the matrix R times and print the resultant matrix. Rotation should be in anti-clockwise direction.

Rotation of a 4x5 matrix is represented by the following figure. Note that in one rotation, you have to shift elements by one step only (refer sample tests for more clarity).

matrix-rotation

It is guaranteed that the minimum of M and N will be even.

Input 
First line contains three space separated integers, M, N and R, where M is the number of rows, N is number of columns in matrix, and R is the number of times the matrix has to be rotated. 
Then M lines follow, where each line contains N space separated positive integers. These M lines represent the matrix.

Output 
Print the rotated matrix.

Constraints 
2 <= M, N <= 300 
1 <= R <= 109 
min(M, N) % 2 == 0 
1 <= aij <= 108, where i = [1..M] & j = [1..N]
 */
public class _27_MatrixRotation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String []input = in.readLine().split("\\ ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		int R = Integer.parseInt(input[2]);
		
		int [][] matrix = new int[M][N];
		
		for(int i = 0; i < M; i ++) {
			input = in.readLine().split("\\ ");
			for(int j = 0; j < N; j ++) {
				matrix[i][j] = Integer.parseInt(input[j]);
			}
		}

		int i = 0, j = 0;
		while(i < M && j < N) {
			if(j == 0) {
				matrix[i + 1][j] = matrix[i][j];
				i ++;
			} else if(i == 0) {
				
			} else if(i == M - 1) {
				
			} else if(j == N - 1) {
				
			}
			
			display(matrix, M, N);
		}
	}
	
	public static void display(int [][]matrix, int m, int n) {
		System.out.println();
		for(int i = 0; i < m; i ++) {
			for(int j = 0; j < n; j ++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

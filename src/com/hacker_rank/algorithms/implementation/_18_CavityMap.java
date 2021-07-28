package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given a square map of size n×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1<=n<=100
Output Format

Output n lines, denoting the resulting map. Each cavity should be replaced with character X
 */
public class _18_CavityMap {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String input[] = new String[n];
		//Get Grid
		for(int i = 0; i < n; i ++) {
			input[i] = in.readLine();
		}
		
		for(int i = 0; i < n; i ++) {
			if(i == 0 || i == n - 1) {
				System.out.println(input[i]);
			} else {
				for(int j = 0; j < n; j ++) {
					if(j == 0 || j == n - 1) {
						System.out.print(input[i].charAt(j));
					} else {
						int num = Integer.parseInt(input[i].charAt(j)+"");
						//Check num left
						if(num <= Integer.parseInt(input[i].charAt(j - 1) + "")) {
							System.out.print(input[i].charAt(j));
						}
						//Check num right
						else if(num <= Integer.parseInt(input[i].charAt(j + 1) + "")) {
							System.out.print(input[i].charAt(j));
						}
						//Check num top
						else if(num <= Integer.parseInt(input[i - 1].charAt(j) + "")) {
							System.out.print(input[i].charAt(j));
						}
						//Check num left
						else if(num <= Integer.parseInt(input[i + 1].charAt(j) + "")) {
							System.out.print(input[i].charAt(j));
						}
						else {
							System.out.print("X");
						}
					}
				}
				System.out.println();
			}
		}
	}
}

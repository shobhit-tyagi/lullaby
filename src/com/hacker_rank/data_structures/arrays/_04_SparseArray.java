package com.hacker_rank.data_structures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

There are N strings. Each string's length is no more than 20 characters. There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains N, the number of strings.
The next N lines each contain a string.
The N+2nd line contains Q, the number of queries.
The following Q lines each contain a query string.

Constraints

1<=N<=1000 
1<=Q<=1000 
1<= length of any string<=20
Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output

2
1
0
Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
 */
public class _04_SparseArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String [] input1 = new String[N];
		for(int i = 0; i < N; i ++) {
			input1[i] = in.readLine();
		}
		
		int Q = Integer.parseInt(in.readLine());
		String [] input2 = new String[Q];
		for(int i = 0; i < Q; i ++) {
			input2[i] = in.readLine();
		}
		
		for(int i = 0; i < Q; i ++) {
			int sum = 0;
			for(int j = 0; j < N; j ++) {
				if(input1[j].equals(input2[i])) {
					sum ++;
				}
			}
			System.out.println(sum);
		}
	}
}

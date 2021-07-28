package com.hacker_rank.data_structures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform). 
The second line contains  space-separated integers describing the respective elements of the array's initial state.

1 2 3 4 5

Output Format

Print a single line of space-separated integers denoting the final state of the array after performing  left rotations.
 */
public class _06_LeftRotation {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        
        int[] array = new int[N];
        
        for (int i = 0; i < N; i ++) {
        	
        	array[(i - D + N) % N] = scanner.nextInt();
        }
		
        for (int i = 0; i < N; i ++) {
        	
        	System.out.print(array[i]);
        	if (i != N - 1) {
        		System.out.print(" ");
        	}
        }
	}
}

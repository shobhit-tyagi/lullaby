package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Problem Statement

You are given an array of integers of size N. Can you find the sum of the elements in the array?

Input 
The first line of input consists of an integer N. The next line contains N space-separated integers representing the array elements. 
 */
public class _02_SumArray {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		Integer.parseInt(in.readLine());
		String input = in.readLine();
		String [] array = input.split("\\ ");
		int sum = 0;
		for(String str : array) {
			sum += Integer.parseInt(str);
		}
		
		System.out.println(sum);
	}
}

package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input

The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.

 */
public class _03_SumBigNums {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		Integer.parseInt(in.readLine());
		String input = in.readLine();
		String [] array = input.split("\\ ");
		long sum = 0;
		for(String str : array) {
			sum += Long.parseLong(str);
		}
		
		System.out.println(sum);
	}
}

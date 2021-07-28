package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
Problem Statement

Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

Input Format

The first line, N, is the size of the array. 
The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,....,AN).

Output Format

Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.
 */
public class _05_PlusMinusZero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int numNeg = 0, numPos = 0, numZero = 0;
		
		String numStr = in.readLine();
		
		for(String str : numStr.split("\\ ")) {
			int num = Integer.parseInt(str);
			if(num < 0) {
				numNeg ++;
			} else if(num > 0) {
				numPos ++;
			} else {
				numZero ++;
			}
		}
		DecimalFormat dformat = new DecimalFormat();
		dformat.setMinimumFractionDigits(6);
		System.out.println(dformat.format((float)numPos / N));
		System.out.println(dformat.format((float)numNeg / N));
		System.out.println(dformat.format((float)numZero / N));
	}
}

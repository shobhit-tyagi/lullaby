package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28- five o' clock- one minute past five- ten minutes past five- half past five- twenty minutes to six- quarter to six- thirteen minutes to six- twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1<=H<12
0<=M<60
Output Format

Display the time in words.
 */
public class _24_TimeInWords {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int hour = Integer.parseInt(in.readLine());
		int min = Integer.parseInt(in.readLine());
		
		String [] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight",
							"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
							"sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one",
							"twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
							"twenty seven", "twenty eight", "twenty nine"};
		
		if(min == 0) {
			System.out.println(numbers[hour - 1] + " o' clock");
		} else if(min == 1) {
			System.out.println(numbers[0] + " minute past " + numbers[hour - 1]);
		} else if(min == 15) {
			System.out.println("quarter past " + numbers[hour - 1]);
		} else if(min == 30) {
			System.out.println("half past " + numbers[hour - 1]);
		} else if(min == 45) {
			if(hour == 12) {
				hour = 0;
			}
			System.out.println("quarter to " + numbers[hour]);
		} else if(min == 59) {
			if(hour == 12) {
				hour = 0;
			}
			System.out.println(numbers[0] + " minute to " + numbers[hour]);
		} else if(min > 30) {
			if(hour == 12) {
				hour = 0;
			}
			System.out.println(numbers[60 - min - 1] + " minutes to " + numbers[hour]);
		} else {
			System.out.println(numbers[min - 1] + " minutes past " + numbers[hour - 1]);
		}
	}
}

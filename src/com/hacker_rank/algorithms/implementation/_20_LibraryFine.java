package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

The Head Librarian at a library wants you to create a program that calculates the fine for returning a book after the return date. You are given the actual and the expected return dates. Calculate the fine as follows:

If the book is returned on or before the expected return date, no fine will be charged. In other words, the fine is 0.
If the book is returned in the same calendar month as the expected return date, the fine = 15 Hackos ? the number of late days.
If the book is not returned in the same calendar month but in the same calendar year as the expected return date, the fine = 500 Hackos ? the number of late months.
If the book is not returned in the same calendar year, the fine is fixed at 10000 Hackos.
Input 
You are given the actual and the expected return dates in D M Y format on two separate lines. The first line contains the D M Y values for the actual return date and the next line contains the D M Y values for the expected return date. Here's a sample:

9 6 2015
6 6 2015
Constraints: 
1<=D<=31 
1<=M<=12 
1<=Y<=3000 
The given date is a valid date on a Gregorian calendar.

Output 
Print a single value representing the fine. 
The sample output for the above input would be 45. 
Since the actual return date is 3 days later than expected, the fine is calculated as 15?3=45 Hackos.
 */
public class _20_LibraryFine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String []actualDate = in.readLine().split("\\ ");
		String []expectedDate = in.readLine().split("\\ ");
		if(Integer.parseInt(expectedDate[2]) < Integer.parseInt(actualDate[2])) {
			System.out.println(10000);
		} else if(Integer.parseInt(expectedDate[2]) > Integer.parseInt(actualDate[2])) {
			System.out.println(0);
		} else if(Integer.parseInt(expectedDate[1]) < Integer.parseInt(actualDate[1])) {
			System.out.println((Integer.parseInt(actualDate[1]) - Integer.parseInt(expectedDate[1])) * 500);
		}  else if(Integer.parseInt(expectedDate[1]) > Integer.parseInt(actualDate[1])) {
			System.out.println(0);
		} else if(Integer.parseInt(expectedDate[0]) < Integer.parseInt(actualDate[0])) {
			System.out.println((Integer.parseInt(actualDate[0]) - Integer.parseInt(expectedDate[0])) * 15);
		} else {
			System.out.println(0);
		}
	}
}

package com.hacker_rank.java.strings;

/*
Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space
 */

import java.util.Scanner;

public class _01_JavaStringsIntroduction {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String A = sc.next();
	    String B = sc.next();
	    
	    int lengthA = A.length();
	    int lengthB = B.length();
	    
	    boolean isLarger = false;
	    
	    for (int i = 0; i < lengthA; i ++) {
	    	
	    	if (i >= lengthB) {
	    		
	    		break;
	    	}
	    	
	    	if (A.charAt(i) > B.charAt(i)) {
	    		
	    		isLarger = true;
	    		break;
	    	} else if (A.charAt(i) < B.charAt(i)) {
	    		
	    		break;
	    	}
	    }
	    
	    System.out.println(lengthA + lengthB);
	    System.out.println(isLarger ? "Yes" : "No");
	    String concat = new StringBuilder(A.substring(0, 1).toUpperCase()).append(A.substring(1, lengthA))
	    		                                                                 .append(" ")
	    		                                                                 .append(B.substring(0, 1).toUpperCase())
	    		                                                                 .append(B.substring(1, lengthB))
	    		                                                                 .toString();
	     
	    System.out.println(concat);
	    
	    sc.close();
	}
}

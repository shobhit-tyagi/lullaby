package com.hacker_rank.java.strings;

import java.util.Scanner;

/*
Given a string ,A print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes
 */

public class _03_JavaStringReverse {

	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        StringBuilder strBld = new StringBuilder();
        
        for (int i = A.length() - 1; i >= 0 ; i --) {
        	
        	strBld.append(A.charAt(i));
        }
        
        if (A.equals(strBld.toString())) {
        	
        	System.out.println("Yes");
        } else {
        	
        	System.out.println("No");
        }
        sc.close();
	}
}

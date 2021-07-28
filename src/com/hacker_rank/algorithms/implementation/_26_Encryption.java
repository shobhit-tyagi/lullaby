package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let L be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:

floor function and ceil function
For example, the sentence "if man was meant to stay on the ground god would have given us roots" after removing spaces is 54 characters long, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
Ensure that rows×columns>=L
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columns.
The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be 81 characters. Print the encoded message.
 */
public class _26_Encryption {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		input = input.replaceAll(" ", "");
		int numRows = (int) Math.floor(Math.sqrt(input.length()));
		int numCols = (int) Math.ceil(Math.sqrt(input.length()));
		if(numRows * numCols < input.length()) {
			numRows ++;
		}
		for(int i = 0; i < numCols; i ++) {
			for(int j = 0; j < numRows; j ++) {
				if(j * numCols + i >= input.length()) {
					break;
				}
				System.out.print(input.charAt(j * numCols + i));
			}
			System.out.print(" ");
		}
	}
}

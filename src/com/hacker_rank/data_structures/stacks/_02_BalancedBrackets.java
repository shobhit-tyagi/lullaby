package com.hacker_rank.data_structures.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Problem Statement

Given a sequence consisting of parentheses, determine whether the expression is balanced. A sequence of parentheses is balanced if every open parentheses can be paired uniquely with a closed parentheses that occurs after the former. Also, the interval between them must be balanced. You will be given three types of parentheses: (, {, and [.

{[()]} - This is a balanced parentheses.
{[(])} - This is not a balanced parentheses.
Input Format

The first line of input contains the number of test cases, T. Each test case consists of a single line, S, the sequence of parentheses.

Constraints 
1<=T<=1000 
1<=lens<=1000, where lens is the length of the sequence. 
Each character of the sequence will be one of {, }, (, ), [, ].

Output Format

For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO". Do not print the quotes.
 */
public class _02_BalancedBrackets {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Character> stack = new ArrayList<Character>();
		while(N > 0) {
			String input = br.readLine();
			int index = 0;
			boolean flag = true;
			while(index < input.length()) {
				Character c = input.charAt(index);
				if(c == '[' || c == '{' || c == '(') {
					stack.add(c);
				} else {
					if(c == '}' && !stack.isEmpty() && stack.get(stack.size() - 1) == '{') {
						stack.remove(stack.size() - 1);
					} else if(c == ']' && !stack.isEmpty() && stack.get(stack.size() - 1) == '[') {
						stack.remove(stack.size() - 1);
					} else if(c == ')' && !stack.isEmpty() && stack.get(stack.size() - 1) == '(') {
						stack.remove(stack.size() - 1);
					} else {
						System.out.println("NO");
						flag = false;
						break;
					}
				}
				index ++;
			}
            if(flag && stack.isEmpty()) {
				System.out.println("YES");
			} else if(flag && !stack.isEmpty()) {
                System.out.println("NO");
            } else {
				stack = new ArrayList<Character>();
			}
			N --;
		}
	}
}

package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Problem Statement

You are given a list of N people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not. Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.

Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.

Input Format

The first line contains two integers, N and M, separated by a single space, where N represents the number of people, and M represents the number of topics. N lines follow.
Each line contains a binary string of length M. If the ith line's jth character is 1, then the ith person knows the jth topic; otherwise, he doesn't know the topic.

Constraints 
2<=N<=500 
1<=M<=500

Output Format

On the first line, print the maximum number of topics a 2-person team can know. 
On the second line, print the number of 2-person teams that can know the maximum number of topics.
 */
public class _21_AcmIpcTeam {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String []input1 = in.readLine().split("\\ ");
		int N = Integer.parseInt(input1[0]);
		int M = Integer.parseInt(input1[1]);
		int maxTopics = -1;
		int maxTeams = 0;
		List<String> peopleList = new ArrayList<String>();
		while(N > 0) {
			String nextPerson = in.readLine();
			for(String person : peopleList) {
				int temp = 0;
				for(int i = 0; i < M; i ++) {
					if(person.charAt(i) == '1' || nextPerson.charAt(i) == '1') {
						temp ++;
					}
				}
				if(maxTopics == temp) {
					maxTeams ++;
				} else if(temp > maxTopics) {
					maxTopics = temp;
					maxTeams = 1;
				}
			}
			peopleList.add(nextPerson);
			N --;
		}
		System.out.println(maxTopics);
		System.out.println(maxTeams);
	}
}

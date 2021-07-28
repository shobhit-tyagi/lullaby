package com.hacker_rank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01<=hh<=12.

Output Format

Convert and print the given time in 24-hour format, where 00<=hh<=23.
 */
public class _07_TimeConversion {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String time = in.readLine();
		
		String[] timeComp = time.split("\\:");
		String amPm = timeComp[2].substring(2, 4);
		if(timeComp[0].equals("12")) {
			timeComp[0] = "00";
		}
		if(amPm.equals("AM")) {
			System.out.println(timeComp[0]+":"+timeComp[1]+":"+timeComp[2].substring(0, 2));
		} else {
			System.out.println((Integer.parseInt(timeComp[0])+12)+":"+timeComp[1]+":"+timeComp[2].substring(0, 2));
		}
	}
}

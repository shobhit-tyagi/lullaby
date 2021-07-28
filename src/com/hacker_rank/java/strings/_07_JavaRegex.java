package com.hacker_rank.java.strings;

import java.util.Scanner;

/*
 Write a class called myRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address
 */
public class _07_JavaRegex {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex {

	public final String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
							      "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
								  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
								  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
package com.hacker_rank.java.strings;

import java.util.Scanner;

public class _05_JavaStringTokens {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.replaceAll("!|\\,|\\?|\\.|\\_|\\'|\\@", " ");
        
        if (s.trim().length() > 0) {
        	
        	String [] tokens = s.trim().split(" +");
            
            System.out.println(tokens.length);
            
            for (String token : tokens) {
            	
            	System.out.println(token);
            }
        } else {
        	
        	System.out.println(0);
        }
        scan.close();
    }
}

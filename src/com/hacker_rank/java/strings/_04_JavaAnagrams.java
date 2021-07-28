package com.hacker_rank.java.strings;

import java.util.Arrays;

public class _04_JavaAnagrams {

	static boolean isAnagram(String a, String b) {
        
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	
        int [] chars = new int[26];
        
        Arrays.fill(chars, 0);
    	
        if (a.length() != b.length()) {
    	   
    	    return false;
        }
       
        for (int i = 0; i < a.length(); i ++) {
        	
        	int index1 = a.charAt(i) - 97;
        	int index2 = b.charAt(i) - 97;
        	chars[index1] = chars[index1] + 1;
        	chars[index2] = chars[index2] - 1;
        }
        
        for (int i = 0; i < 26; i ++) {
        	
        	if (chars[i] != 0) {
        		
        		return false;
        	}
        }
        
        return true;
    }
}

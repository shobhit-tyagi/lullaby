package com.hacker_rank.algorithms.implementation;

import java.util.Scanner;

public class _28_CompareTriplets {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int x = 0, y = 0;
        
        if (a0 > b0) {
        	
        	x ++;
        } else if (a0 < b0) {
        	
        	y ++;
        }
        
        if (a1 > b1) {
        	
        	x ++;
        } else if (a1 < b1) {
        	
        	y ++;
        }
        
        if (a2 > b2) {
        	
        	x ++;
        } else if (a2 < b2) {
        	
        	y ++;
        }
        
        System.out.println(x + " " + y);
        
        in.close();
    }
}

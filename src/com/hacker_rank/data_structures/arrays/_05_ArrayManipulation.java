package com.hacker_rank.data_structures.arrays;

import java.util.Scanner;

/*

Problem Statement

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros . Your list of queries is as follows:

    a b k
    1 5 3
    4 8 7
    6 9 1
Add the values of  between the indices  and  inclusive:

index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]
The largest value is  after all operations are performed.

Input Format

The first line contains two space-separated integers  and , the size of the array and the number of operations. 
Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.

Output Format

Return the integer maximum value in the finished array.
 */
public class _05_ArrayManipulation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		long elements [] = new long[N];
		for (int i = 0; i < M; i ++) {
			
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int K = scanner.nextInt();
			
			elements[A - 1] += K;
			if (B < N) {
				
				elements[B] -= K;
			}
		}
		
		long max = 0;
		long temp = 0;
		for (int i = 0; i < N; i ++) {
			
			temp = temp + elements[i];
	       if(max < temp) {
	    	   
	    	   max = temp;
	       }
		}
		
		System.out.println(max);
	}
//	
//     public static void main(String[] args) {
//        
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int M = scanner.nextInt();
//        
//        long elements [] = new long[N];
//        long max = 0;
//        for (int i = 0; i < M; i ++) {
//            
//            int A = scanner.nextInt();
//            int B = scanner.nextInt();
//            int K = scanner.nextInt();
//            
//            for (int j = A-1; j <= B-1; j ++) {
//                
//                elements[j] += K;
//                if (elements[j] > max) {
//                    max = elements[j];
//                }
//            }
//        }
//        
//        System.out.println(max);
//    }
}

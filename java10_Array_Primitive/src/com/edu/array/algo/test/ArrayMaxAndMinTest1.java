package com.edu.array.algo.test;

public class ArrayMaxAndMinTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {1, 2, 5, 3, 4, 7, 9};
		
		
		int min = scores[0];
		int max = scores[0];
		
		for(int i : scores) {
			if(i < min) min = i;
			if(i > min) max = i;
			
		}
		
		System.out.println(min + " " + max);
		
	}

}

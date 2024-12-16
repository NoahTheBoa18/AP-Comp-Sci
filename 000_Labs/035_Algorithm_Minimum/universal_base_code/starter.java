/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	int arraySize = (int)(Math.random() * 149) + 51;
	int[]arr = new int [arraySize];
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	double sum = 0.0;
	
	for(int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random() * 100) + 1;
		
		if(arr[i] < min)
			min = arr[i];
		
		if(arr[i] > max)
			max = arr[i];
		
		sum = sum + arr[i];
		
	}
	
	
	double average = sum / (double)arr.length;
	
	System.out.println(min);
	System.out.println(max);
	System.out.println(average);


		
	}
}

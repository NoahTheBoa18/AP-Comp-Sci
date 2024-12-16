/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/



import java.util.*;

class starter {
	public static void main(String args[]) {
	
	
		int [] arr = new int[20];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 9) + 1;
			System.out.println(arr[i] + " ");
		}
		
		int dupeCount = 0;
		for(int x = 1; x < 10; x++){
			
			int count = 0;
			for(int i = 0; i < arr.length; i++){
				if(x == arr[i])
				count +=1;
			}
			
			if (count > 1)
				dupeCount +=1;
		}
		System.out.println("Duplicate count: " + dupeCount);
		
		
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] == arr[i+1])
				System.out.println("Consecutive at " + i + " and " + (i+1));
		}
	}
}

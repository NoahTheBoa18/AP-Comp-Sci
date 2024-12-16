/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to be written in Sponge Case");
        String sentence = sc.nextLine();
        

		for(int i = 0; i < sentence.length(); i++){
			String letter = sentence.substring(i,i+1);
			
			if(i%2==0){
				String upperCase = letter.toUpperCase();
				System.out.print(upperCase);
			}
				
			if(i%2==1){
				String lowerCase = letter.toLowerCase();
				System.out.print(lowerCase);
			}
		}
	}
}

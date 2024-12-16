/*
   * Author:
   * Date:
   * Collaborator(s):
*/


import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int start = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals(" ")) {

                String word = sentence.substring(start, i);
                
                String firstLetter = word.substring(0, 1).toLowerCase();
                
                if (firstLetter.equals("a") || firstLetter.equals("e") || 
                    firstLetter.equals("i") || firstLetter.equals("o") || 
                    firstLetter.equals("u")) {
                    System.out.print(word + "way ");
                } else {
                    System.out.print(word.substring(1) + firstLetter + "ay ");
                }
                
                
                start = i + 1;
            }
        }
        

        String lastWord = sentence.substring(start);
        String firstLetter = lastWord.substring(0, 1).toLowerCase();
        

        if (firstLetter.equals("a") || firstLetter.equals("e") || 
            firstLetter.equals("i") || firstLetter.equals("o") || 
            firstLetter.equals("u")) {
            System.out.print(lastWord + "way");
        } else {
            System.out.print(lastWord.substring(1) + firstLetter + "ay");
        }
        

        scanner.close();
    }
}
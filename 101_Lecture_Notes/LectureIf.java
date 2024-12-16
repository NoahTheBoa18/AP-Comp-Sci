/* 
    Lecture note example - If Statements
*/

import java.util.*;

class LectureIf{
    public static void main(String args[]) {
        
    boolean x = true;
    boolean y = false;
    
    boolean z = 5 > 3;
    boolean a = 3 < 4;
    boolean b = 4 == 4;
    boolean c = 4 != 5;
    boolean d = 3 <= 3;
    boolean e = 5 >= 8;
    
    
    boolean h = ("hello").equals("hello");
    
    if(5 > 3){
        System.out.println("this runs");
    }
    
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Numba pls");
    int num = sc.nextInt();
    
    if(num > 10){
        System.out.println("Your numba bigger than 10");
    }
    
	}
}
import pkg.*;
import java.util.*;



class starter {
	public static void main(String[] var0) {
		Wizard[] arr1 = new Wizard[100];
		Warrior[] arr2 = new Warrior[100];
		
		int arr3;
		for(arr3 = 0; arr3 < 100; ++arr3){
			arr1[arr3] = new Wizard();
			arr2[arr3] = new Warrior();
		}
		
		arr3 = 0;
		int arr4 = 0;
		Random arr5 = new Random();
		int arr6 = arr5.nextInt(2);
		
		while(!arr1[99].isDead() || !arr2[99].isDead()){
			if (arr6 == 0) {
				arr1[arr3].attack(arr2[arr4]);
				if (arr2[arr4].isDead()) {
					if (arr2[99].isDead()) {
					  break;
					}
					
					++arr4;
				}
				
				arr2[arr4].attack(arr1[arr3]);
				if (arr1[arr3].isDead()) {
					if (arr1[99].isDead()) {
						
					}
					
					++arr3;
				}
			} else{
				arr2[arr4].attack(arr1[arr3]);
				if (arr1[arr3].isDead()) {
					if (arr1[99].isDead()) {
						break;
					}
					
					++arr3;
				}
				
				arr1[arr3].attack(arr2[arr4]);
				if (arr2[arr4].isDead()) {
					if (arr2[99].isDead()) {
						break;
					}
					
					++arr4;
				}
			}
			
			
		}
		
		if (arr1[99].isDead()) {
			System.out.println("Warriors won with " + (100 - arr4) + " left in their army");
			
			
		}
		
		if (arr2[99].isDead()) {
			System.out.println("wizards won with " + (100 - arr3) + " left in their army");
		}

	}
}

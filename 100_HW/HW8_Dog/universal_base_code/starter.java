/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String[] args) {
        // Create the first dog with a name, and set the age
        Dog dog1 = new Dog("Buddy");
        dog1.setAge(4);

        // Create the second dog with a name and a breed
        Dog dog2 = new Dog("Max", "Labrador");

        // Check if the first dog is sleeping
        if (dog1.isSleeping()) {
            System.out.println(dog1.getName() + " is asleep.");
        } else {
            dog1.bark();
        }

        // Check if the second dog is sleeping
        if (dog2.isSleeping()) {
            if (!dog1.isSleeping()) {
                dog2.bark();
            }
        } else {
            if (!dog1.isSleeping()) {
                dog2.bark();
            }
        }
    }
}
// UserInput.java

import java.util.Scanner;

class UserInput {
    // Method to accept 5 numbers from the user
    int[] arrayInput() {
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        
        return array;
    }
}

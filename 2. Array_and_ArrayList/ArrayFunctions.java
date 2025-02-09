// ArrayFunctions.java

import java.util.*;

class ArrayFunctions {

    // Method to segregate even and odd numbers into separate ArrayLists
    void evenOdd() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }

        // Display the even and odd ArrayLists
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    // Method to find two neighboring numbers with the smallest difference
    void minimum() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        int minDiff = Integer.MAX_VALUE;
        int index = -1;
        int firstNum = -1;
        int secondNum = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
                firstNum = array[i];
                secondNum = array[i + 1];
            }
        }

        System.out.println("The smallest difference is " + minDiff + " (between " + firstNum + " and " + secondNum + "), " +
                           "and the index of the first number (" + firstNum + ") is " + index + ".");
    }

    // Method to convert array to ArrayList and vice versa
    void convertArrayToArrayList() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        
        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        
        // Display ArrayList
        System.out.println("Array as ArrayList: " + arrayList);
        
        // Convert ArrayList back to array
        int[] convertedArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            convertedArray[i] = arrayList.get(i);
        }
        
        // Display array after conversion
        System.out.print("Array after converting back from ArrayList: ");
        for (int i : convertedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

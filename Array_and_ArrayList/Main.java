// Main.java
// Name: Shriyans Sahoo
// PRN: 23070126125
// Batch: AIML B2 (23-27)

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayFunctions functions = new ArrayFunctions();
        
        while (true) {
            // Display the menu to the user
            System.out.println("\nMenu:");
            System.out.println("1. Segregate Even and Odd Numbers");
            System.out.println("2. Find Two Neighboring Numbers with the Smallest Difference");
            System.out.println("3. Convert Array to ArrayList and Vice Versa");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            
            int choice = scan.nextInt(); // Get the user's choice

            switch (choice) {
                case 1:
                    functions.evenOdd();
                    break;

                case 2:
                    functions.minimum();
                    break;

                case 3:
                    functions.convertArrayToArrayList();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

# ArrayFunctions Project

## Overview

This Java project implements three core functionalities related to arrays:

1. **Segregate Even and Odd Numbers** - Separates even and odd numbers from an array into two separate lists.
2. **Find Two Neighboring Numbers with the Smallest Difference** - Identifies two adjacent numbers in an array with the smallest absolute difference.
3. **Convert Array to ArrayList and Vice Versa** - Converts an array into an ArrayList and back to an array.

The project is structured with three Java files:

- `ArrayFunctions.java` - Contains the main logic for the functionalities.
- `Main.java` - Provides a menu-driven interface for user interaction.
- `UserInput.java` - Handles user input operations.

## Features

- Menu-driven console application
- Efficient array operations
- User-friendly input handling

## Installation & Usage

### Prerequisites

- Java Development Kit (JDK) installed

### Steps to Run

1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/ArrayFunctions.git
   ```
2. Navigate to the project directory:
   ```sh
   cd ArrayFunctions
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the program:
   ```sh
   java Main
   ```

## How It Works

Upon running the program, the user is presented with a menu:

- **Option 1:** Input numbers and get even and odd numbers separately.
- **Option 2:** Find the smallest difference between two adjacent numbers.
- **Option 3:** Convert an array to an ArrayList and back to an array.
- **Option 4:** Exit the program.

## Code Structure

- `ArrayFunctions` class:
  - `evenOdd()` - Segregates even and odd numbers.
  - `minimum()` - Finds two adjacent numbers with the smallest difference.
  - `convertArrayToArrayList()` - Converts an array to an ArrayList and back.
- `UserInput` class:
  - `arrayInput()` - Takes user input and returns an integer array.
- `Main` class:
  - Provides a menu-based interface for executing different functionalities.

## Example Run

```
Menu:
1. Segregate Even and Odd Numbers
2. Find Two Neighboring Numbers with the Smallest Difference
3. Convert Array to ArrayList and Vice Versa
4. Exit
Please choose an option: 1
Enter five numbers:
10 15 20 25 30
Even numbers: [10, 20, 30]
Odd numbers: [15, 25]
```


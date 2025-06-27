import java.util.Scanner;
  
// Main class definition 
class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the number of rows and columns for the 2D array
        int rows = 2, cols = 4;
        int[][] arr = new int[rows][cols]; // Declare and initialize the 2D array

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt(); // Read each element from user input
            }
        }

        // Print the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " "); // Print each element in a row
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close(); // Close the scanner to free resources
    }
}

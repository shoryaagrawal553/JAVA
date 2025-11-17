import java.util.Scanner; // Import the Scanner class for user input

// Define the Main class
class Main {  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for reading input
        
        int m = 3; // Define the size of the matrix (3x3)
        int[][] arr = new int[m][m]; // Declare a 2D array for the matrix
    
        // Prompt the user to enter the matrix elements
        System.out.print("Enter the elements of the first matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt(); // Read each element from user input
            }
        }
  
        // Print the transpose of the matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[j][i] + " "); // Print the transposed element
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

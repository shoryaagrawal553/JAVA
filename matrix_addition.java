import java.util.Scanner;

// Main class containing the matrix addition logic
class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Define the number of rows and columns for the matrices
        int rows = 2, cols = 2;

        // Declare and initialize the matrices
        int[][] arr1 = new int[rows][cols]; // First matrix
        int[][] arr2 = new int[rows][cols]; // Second matrix
        int[][] ans = new int[rows][cols];  // Matrix to store the result

        // Input elements for the first matrix
        System.out.print("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.print("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Add the two matrices and print the result
        System.out.println("Matrix after addition:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                ans[i][j] = arr1[i][j] + arr2[i][j]; // Perform addition
                System.out.print(ans[i][j] + " ");   // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

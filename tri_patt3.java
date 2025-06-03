/* 
This program prints a triangular pattern of numbers.
Example for input 4:
1  
2 3  
4 5 6  
7 8 9 10  
*/

import java.util.Scanner; // Import the Scanner class for user input

public class Main
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sn = new Scanner(System.in);
        
        System.out.print("enter "); // Prompt user for input
        
        int n = sn.nextInt(); // Read the integer input (number of rows)
        
        int temp = 1; // Initialize the starting number to print
        // Outer loop for each row
        for(int i = 1; i <= n; i++)
        {
            // Inner loop for printing numbers in each row
            for(int j = 1; j <= i; j++)
            {
                System.out.print(temp + " "); // Print the current number
                temp++; // Increment the number for next print
            }
            System.out.println(" "); // Move to next line after each row
        }
    }
}

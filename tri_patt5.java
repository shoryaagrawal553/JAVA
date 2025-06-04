/* 
Example Output:
Enter the Number:4
   1 
  2 3 
 4 5 6 
7 8 9 10    
*/

import java.util.Scanner;

class Main {
    public static void main(String[] s) {
        
        // Prompt the user to enter a number
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt(); // Read the number of rows from user
        int temp = 1;         // Initialize the starting number to print
        
        // Outer loop for each row
        for(int i = 1; i <= n; i++)
        {
            // Print leading spaces for triangle alignment
            for(int j = i; j < n; j++)
            {
                System.out.print(" ");
            }
            
            // Print numbers for the current row
            for(int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp++; // Increase the number for next print
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}

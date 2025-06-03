/* 
Example output if you enter 4:
1  
2 2  
3 3 3  
4 4 4 4    
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sn = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("enter ");

        // Read the integer entered by the user
        int n = sn.nextInt();

        // Outer loop for each row (from 1 to n)
        for (int i = 1; i <= n; i++)
        {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++)
            {
                // Print the current row number, followed by a space
                System.out.print(i + " ");
            }
            // Move to the next line after each row is printed
            System.out.println(" ");
        }
    }
}

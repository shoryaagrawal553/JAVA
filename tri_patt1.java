/*  enter 4
*  
* *  
* * *  
* * * *    */
// This program prints a left-aligned triangle pattern of asterisks based on user input.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sn = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows for the triangle
        System.out.print("enter ");
        
        // Read the integer input from the user
        int n = sn.nextInt();
        
        // Outer loop for the number of rows
        for(int i = 1; i <= n; i++)
        {
            // Inner loop for printing asterisks in each row
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            // Move to the next line after printing a row
            System.out.println(" ");
        }
    }
}

import java.util.Scanner; // Importing Scanner class for taking user input
  
// Main class  
public class Main    
{
    // Main method - execution starts  here
    public static void main(String[] args) 
    {
        // Creating a Scanner object to take input from the user
        Scanner sn = new Scanner(System.in);
        
        // Prompting the user to enter a value
        System.out.print("enter ");
        
        // Reading an integer input from the user
        int n = sn.nextInt();
        
        // Outer loop to iterate through rows
        for (int i = 1; i <= n; i++)
        {
            // Inner loop to iterate through columns
            for (int j = 1; j <= n; j++)
            {
                // Printing the current row number 'i' 'n' times
                System.out.print(i + " ");
            }
            // Moving to the next line after printing all columns for a row
            System.out.println(" ");
        }
    }
}

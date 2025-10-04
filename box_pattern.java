import java.util.Scanner; // Importing Scanner class for input
   
// Main class     
public class Main   
{
    // Main method where the program execution begins
    public static void main(String[] args) 
    {
        // Creating a Scanner object to take user input
        Scanner sn = new Scanner(System.in);
        
        // Prompting the user to enter the size of the box
        System.out.print("enter ");
        
        // Reading the integer input from the user
        int n = sn.nextInt();
        
        // Outer loop to iterate through the rows
        for (int i = 1; i <= n; i++) 
        {
            // Inner loop to iterate through the columns
            for (int j = 1; j <= n; j++) 
            {
                // Printing an asterisk followed by a space
                System.out.print("* ");
            }
            // Moving to the next line after completing a row
            System.out.println(" ");
        }
    }
}

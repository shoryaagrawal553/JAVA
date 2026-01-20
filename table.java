import java.util.Scanner; // Import the Scanner class for user input

// Main class
class Main
{
    // Main method: program entry point
    public static void main(String args[])
    {
        System.out.println("enter a number "); // Prompt user to enter a number
        Scanner sn = new Scanner(System.in);   // Create Scanner object for input
        
        int n = sn.nextInt();                  // Read the integer input from the user
        
        int i = 1;                             // Initialize counter variable
        while (i <= 10)                        // Loop to print first 10 multiples
        {
            System.out.println(n * i);         // Print the current multiple
            i++;                               // Increment the counter
        }
    }
}
  

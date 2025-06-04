import java.util.Scanner;

// Main class definition
class Main
{
    public static void main(String args[])
    {
        // Prompt the user to enter a number
        System.out.println("enter a number ");
        
        // Create a Scanner object to read input from the user
        Scanner sn = new Scanner(System.in);
        
        // Read the integer input from the user
        int n = sn.nextInt();
        
        // Initialize variables for factorial calculation
        int fact = 1;
        int i = 1;
        
        // Calculate factorial using a while loop
        while (i <= n)
        {
            fact *= i; // Multiply fact by current value of i
            i++;       // Increment i by 1
        }
        
        // Output the calculated factorial
        System.out.println(fact);
        
        // Close the Scanner to avoid resource leak
        sn.close();
    }
};

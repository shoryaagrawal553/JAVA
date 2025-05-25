import java.util.Scanner;

// Main class containing the program
public class Main 
{
    // Function to return the greater of two numbers
    static int max(int a, int b)
    {
        // If a is greater than b, return a
        if(a > b)
        {
           return a; 
        }
        // Otherwise, return b
        else
        {
            return b;
        }
    }
    
    // Main method: entry point of the program
    public static void main (String[] args) 
    {
        // Prompt the user to enter two numbers
        System.out.print("enter two numbers ");
        Scanner sc = new Scanner(System.in);
        
        // Read the first number
        int a = sc.nextInt();
        // Read the second number
        int b = sc.nextInt();
        
        // Print the greatest number using the max function
        System.out.println("The greatest number is " + max(a, b));
    }
}

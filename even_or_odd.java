import java.util.Scanner; // Importing the Scanner class for taking user input

// Main class    
public class Main   
{
    // Main method - the entry point of the program
    public static void main(String[] args) 
    {
        // Prompting the user to enter a number
        System.out.println("Enter a number ");
        
        // Creating a Scanner object to read input from the user
        Scanner num = new Scanner(System.in);
        
        // Reading an integer input from the user
        int a = num.nextInt();
        
        // Checking if the number is even or odd
        if (a % 2 == 0) // If the number is divisible by 2 with no remainder, it is even
        {
            System.out.println(a + " is an even number"); // Printing that the number is even
        }
        else // If the number is not divisible by 2, it is odd
        {
            System.out.println(a + " is an odd number"); // Printing that the number is odd
        }
    }
}

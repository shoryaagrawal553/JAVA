import java.util.Scanner; // Importing the Scanner class to take user input

// Main class definition
class Main 
{
    // Main method - the entry point of the program
    public static void main(String args[])
    {
        int age; // Variable to store the user's age

        // Prompt the user to enter their age
        System.out.println("enter your age ");
        
        // Create a Scanner object to read input
        Scanner A = new Scanner(System.in);
        
        // Read the age input from the user
        age = A.nextInt();
        
        // Check if the user's age is 18 or above
        if(age >= 18)
        {
            // Inform the user that they are allowed to vote
            System.out.println("you are allowed to vote ");
        }
    }
}

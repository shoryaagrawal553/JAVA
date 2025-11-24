import java.util.Scanner;

// Main class 
class Main 
{
    public static void main(String args[])
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their pin
        System.out.print("enter your pin ");

        // Read the user's input as a string
        String pin = sc.nextLine();

        // Define the correct pin for comparison
        String opin = "sh122";
        
        // Check if the entered pin matches the correct pin
        if(pin == opin)
        {
            // If the pin is correct, print a success message
            System.out.print(pin + " is correct ");
        }
        else{
            // If the pin is incorrect, print an error message
            System.out.println(pin + " is incorrect");
        }
        
    }
}

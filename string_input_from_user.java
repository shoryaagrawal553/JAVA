import java.util.Scanner; // Import the Scanner class for user input

class Main
{
    public static void main(String args[])
    {
        System.out.print("Enter your name "); // Prompt the user to enter their name
        Scanner name = new Scanner(System.in); // Create a Scanner object to read input from the user
        String a = name.nextLine(); // Read the entire line of user input and store it in variable 'a'
        System.out.println(a + " is your name "); // Display the entered name back to the user
    }
}

import java.util.Scanner; // Import the Scanner class for user input

class Main
{
    public static void main (String args[])
    {
        // Prompt the user to enter marks and attendance percentage
        System.out.println("Enter your marks and attendence percentage");
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        
        int mark = sc.nextInt(); // Read the marks entered by the user
        int att = sc.nextInt(); // Read the attendance percentage entered by the user
        
        // Check if the marks are less than 40 OR attendance is less than 75%
        if (mark < 40 || att < 75)
        {
            System.out.println("FAIL"); // Print FAIL if either condition is true
        }
        else
        {
            System.out.println("PASS"); // Print PASS if both conditions are false
        }
    }
};

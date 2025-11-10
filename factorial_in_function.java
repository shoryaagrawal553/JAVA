import java.util.Scanner;
  
// Main class       
public class Main  
{
    // Function to calculate the factorial of a number
    static int fAct(int a)
    {
        int fact = 1;
        
        // Loop to multiply numbers from 1 to a
        for(int i = 1; i <= a; i++)
        {
            fact *= i;
        }
        
        return fact; // Return the calculated factorial
    }
    
    public static void main(String[] args) 
    {
        System.out.print("Enter a number "); // Prompt user for input
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        int a = sc.nextInt(); // Read integer input from user
        
        // Print the factorial result using the fAct function
        System.out.println("The factorial of "+ a + " is " + fAct(a));
    }
}

import java.util.Scanner;

// Main class
public class Main
{
    // Function to check if a number is not prime
    // Returns 1 if the number is not prime, 0 if it is prime
    static int prime(int a)
    {
        // Check divisibility from 2 to a-1
        for(int i=2; i<a; i++)
        {
            // If 'a' is divisible by any number in this range, it's not prime
            if(a%i == 0)
            {
                return 1; // Not prime
            }
        }
        
        return 0; // Prime
    }
    
    // Main method
    public static void main(String[] args) 
    {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        
        int x=sc.nextInt(); // Read user input
        
        // Use the prime function to check if the number is prime
        if(prime(x) == 1)
        {
            System.out.println(x+" is not prime");
        }
        else
        {
            System.out.println(x+" is prime");
        }
    }
}

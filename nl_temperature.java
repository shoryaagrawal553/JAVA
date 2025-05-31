import java.util.Scanner; // Import Scanner class for user input

class Main
{
    public static void main(String aegs[])
    {
        System.out.println("Enter the temp"); // Prompt the user to enter the temperature
        
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        
        float temp = sc.nextFloat(); // Read the temperature as a float value
        
        // Check if the temperature is below 0
        if(temp<0)
        {
            System.out.println("Freezing warning"); // Print freezing warning if below 0
        }
        // Check if temperature is between 0 (exclusive) and 20 (inclusive)
        else if (temp>0 && temp<= 20)
        {
            System.out.println("Cold"); // Print cold for 0 < temp <= 20
        }
        // Check if temperature is between 20 (exclusive) and 35 (inclusive)
        else if (temp>20 && temp<= 35)
        {
            System.out.println("Normal"); // Print normal for 20 < temp <= 35
        }
        // For any temperature above 35
        else 
        {
            System.out.println("Heat Alert"); // Print heat alert if temp > 35
        }
    }
};

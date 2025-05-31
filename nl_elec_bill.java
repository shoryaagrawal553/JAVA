import java.util.Scanner;

// Main class containing the program logic
class Main
{
    public static void main(String args[])
    {
        // Prompt the user to enter electricity units
        System.out.println("Enter the units");
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt(); // Read the number of units
        
        // Calculate bill for 0-100 units
        if(unit > 0 && unit <= 100)
        {
            System.out.println("Electricity bill: " + unit * 0.50);
        }
        // Calculate bill for 101-300 units
        else if(unit > 100 && unit <= 300)
        {
            System.out.println("Electricity bill: " + unit * 0.75);
        }
        // Calculate bill for units above 300
        else 
        {
            System.out.println("Electricity bill: " + unit * 1.20);
        }
    }
};

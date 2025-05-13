import java.util.Scanner;

// Main class
class Main 
{
    public static void main(String args[])
    {
        // Prompting the user to enter their credit score and salary
        System.out.println("Enter your credit score and salary ");
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Reading the credit score and salary input from the user
        int cred = sc.nextInt(); // Credit score
        int sal = sc.nextInt();  // Salary
        
        // Checking if the loan is approved based on credit score and salary
        if(cred >= 750 && sal >= 60000) // Criteria for loan approval
        {
            System.out.println("Loan approved"); // Loan is approved
        }
        // Checking if the loan is under review based on credit score and salary
        else if (cred > 600 && cred < 750 && sal >= 60000) // Criteria for loan review
        {
            System.out.println("Loan under review"); // Loan is under review
        }
        // If none of the above conditions are met, the loan is rejected
        else 
        {
            System.out.println("Loan rejected"); // Loan is rejected
        }
    }
};

import java.util.Scanner; // Importing the Scanner class for taking user input

// Main class
class Main {
    // Main method - the entry point of the program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input

        // Prompting the user to enter three numbers
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(); // Reading the first number
        int b = sc.nextInt(); // Reading the second number
        int c = sc.nextInt(); // Reading the third number

        // Checking which number is the greatest
        if (a > b && a > c) { // If 'a' is greater than both 'b' and 'c'
            System.out.println(a + " is greatest"); // Output 'a' as the greatest
        } else if (b > c) { // Otherwise, if 'b' is greater than 'c'
            System.out.println(b + " is greatest"); // Output 'b' as the greatest
        } else { // If neither 'a' nor 'b' is the greatest, 'c' must be the greatest
            System.out.println(c + " is greatest"); // Output 'c' as the greatest
        }
    }
}

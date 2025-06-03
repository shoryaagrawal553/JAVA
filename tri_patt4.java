/* Example Output:
Enter the Number:4
1  
0 1  
1 0 1  
0 1 0 1  
*/

import java.util.Scanner;

class Main {
    public static void main(String[] s) {
        
        // Prompt the user to enter a number
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in);
        
        // Read the integer input from the user
        int n = sn.nextInt();
        
        // Outer loop for each row (from 1 to n)
        for(int i = 1; i <= n; i++) {
            // Inner loop for each column in the current row (from 1 to i)
            for(int j = 1; j <= i; j++) {
                // Check if the sum of row and column indexes is even
                // If even, print "1", else print "0"
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to the next line after each row
            System.out.println(" ");
        }
    }
}

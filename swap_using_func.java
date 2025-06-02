// Main class containing the swap method and the main method
public class Main
{
    // This method swaps two integers, but only locally (does not affect variables outside this method)
    static void swap(int a, int b) // changes local variables only
    {
        int temp;             // Temporary variable to help in swapping
        temp = a;             // Store the value of a in temp
        a = b;                // Assign the value of b to a
        b = temp;             // Assign the value of temp (original a) to b

        // Print the swapped values (only swapped locally inside this method)
        System.out.print("The swapped values are: " + a + ", " + b);

    }
    
    // The main method, program execution starts here
    public static void main(String[] args) 
    {
        // Call the swap method with values 2 and 3
        swap(2, 3);
    }
}

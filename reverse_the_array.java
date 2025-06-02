// Main class to reverse an array in place
public class Main
{
    public static void main(String[] args) 
    {
        // Size of the array
        int n = 4;
        // Initialize the array with 4 elements
        int[] arr = {10, 20, 30, 40};
        
        // Variables for the start and end indexes
        int s = 0, e = n - 1;
        int temp; // Temporary variable for swapping
        
        // Loop to reverse the array in place
        while (s < e)
        {
            // Swap the elements at the start and end
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            // Move the start forward and the end backward
            s++;
            e--;
        }
        
        // Print the reversed array
        System.out.print("Reversed Array is: "); 
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " "); 
        }
    }
}

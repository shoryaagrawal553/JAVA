// Main class definition
class Main
{
    public static void main(String args[])
    {
        // Define the number of elements in the array
        int n = 5;
        // Initialize the array with 5 integers
        int[] arr = {1, 2, 3, 4, 5};
        // Variables to count even and odd numbers
        int eve = 0, odd = 0;
        
        // Loop through each element in the array
        for(int i = 0; i < n; i++)
        {
            // Check if the current element is even
            if(arr[i] % 2 == 0)
            {
                eve++; // Increment even counter
            }
            else {
                odd++; // Increment odd counter
            }
        }
        
        // Print out the count of even and odd elements
        System.out.print("number of even elements are " + eve + " and odd is " + odd);
    }
}

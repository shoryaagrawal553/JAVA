import java.util.*;
 
// Main class containing the program
class Main {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {1, 3, 3, 2, 3, 5};
        // The element whose frequency we want to count
        int target = 3;
        // Variable to keep count of occurrences of the target
        int count = 0;

        // Loop through each element in the array
        for (int num : arr) 
        {
            // If the current element matches the target, increment the count
            if (num == target) {
                count++;
            }
        }

        // Output the frequency of the target element
        System.out.println(target + " appears " + count + " times");
        // The next line refers to 'oddCount', which is not defined in this program
        // System.out.println("Odd digits: " + oddCount); // <-- (This line will cause an error)
    }
}

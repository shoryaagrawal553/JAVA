// Main class
class Main {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {1, 2, 8, 9, 11};
        int n = 5;  // Number of elements in the array
        int sum = 0; // Variable to store the sum

        // Loop through the array to calculate the sum
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add each element to sum
        }

        // Print the result
        System.out.print("Sum of Array Element is: " + sum);
    }
}

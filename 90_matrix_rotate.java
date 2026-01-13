import java.util.Scanner;

// Main class   
class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        // Initialize the original 3x3 matrix 
        int[][] arr = new int[3][3];
        // Initialize the matrix to store the rotated result
        int[][] ans = new int[3][3];

        // Prompt the user to enter matrix elements
        System.out.print("Enter the Elements of Matrix:");
        // Input elements for the original matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Rotate the matrix by 90 degrees clockwise
        // Move elements from arr to their rotated positions in ans
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Place element at (i, j) to the correct rotated position
                ans[j][3 - 1 - i] = arr[i][j];
            }
        }

        // Output the rotated matrix
        System.out.println("Matrix after 90 degree rotation:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

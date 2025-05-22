import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int m=3;
        int[][] arr = new int[m][m];
    

        System.out.print("Enter the elements of the first matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
  
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}

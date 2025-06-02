import java.util.Scanner;

// Main class
public class Main
{
    public static void main (String[] args) 
    {
        // Initialize the array of integers
        int[] arr={3,8,9,15,16};
        int n= 5; // Length of the array
        int st=0, en=n-1; // Start and end pointers
        
        Scanner sc= new Scanner(System.in);
        
        // Prompt the user to enter a target sum
        System.out.print("enter the target: ");
        int tar= sc.nextInt();
        
        // Loop to find two elements whose sum equals the target
        while(st<en)
        {
            int sum=arr[st]+arr[en]; // Calculate sum of elements at st and en
            
            if(sum==tar){
                // If the sum matches the target, print indices and exit
                System.out.print("elements found at index "+ st +", "+en);
                return;
            }
            
            else if(tar < sum )
            {
                // If sum is greater than target, move end pointer left
                en--;
            }
            else{
                // If sum is less than target, move start pointer right
                st++;
            }
        }
        
        // If no such pair is found, print message
        System.out.print("element not found ");
    }
}

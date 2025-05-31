class Main
{
    public static void main(String args[])
    {
        int n=6; // Size of the array
        int[] arr={5,7,3,6,1,4}; // Array elements
        
        int min=0; // Variable to store the maximum element, initialized to 0
        
        // Loop through each element in the array
        for(int i=0; i<n; i++)
        {
            // If the current array element is greater than min, update min
            if(arr[i]>min)
            {
                min= arr[i];
            }
        }
        
        // Print the largest element of the array
        System.out.println("largest element of the array is: "+ min);
    }
}

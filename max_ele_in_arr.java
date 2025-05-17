class Main
{
    public static void main(String args[])
    {
        int n=6;
        int[] arr={5,7,3,6,1,4};
        
        int min=0;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]>min)
            {
                min= arr[i];
            }
        }
        
        System.out.println("largest element of the array is: "+ min);
    }
}

class Main
{
    public static void main(String args[])
    {
        int n=5;
        int[] arr={1,2,3,4,5};
        int eve=0, odd=0;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                eve++;
            }
            else{
                odd++;
            }
        }
        
        System.out.print("number of even elements are "+ eve+ " and odd is "+odd);
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		int n=4;
	    int[] arr={10,20,30,40};
	    
	    int s=0, e=n-1;
	    int temp;
	    
	    while(s<e)
	    {
	        temp= arr[s];
	        arr[s]=arr[e];
	        arr[e]= temp;
	        s++;
	        e--;
	    }
	    
	     System.out.print("Reversed Array is: "); 
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" "); 
            
        }

	}
}

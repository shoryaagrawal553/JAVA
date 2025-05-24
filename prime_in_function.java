import java.util.Scanner;

public class Main
{
    static int prime(int a)
    {
        for(int i=2; i<a; i++)
        {
            if(a%i == 0)
            {
                return 1;
            }
        }
        
        return 0;
    }
    
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		
		int x=sc.nextInt();
		
		if(prime(x) == 1)
		{
		    System.out.println(x+" is not prime");
		}
		else
		{
		    System.out.println(x+" is prime");
		}
	}
}

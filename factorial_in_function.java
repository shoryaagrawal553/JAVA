import java.util.Scanner;

public class Main
{
    static int fAct(int a)
    {
        int fact=1;
        
        for(int i=1; i<=a; i++)
        {
            fact*=i;
        }
        
        return fact;
    }
    
	public static void main(String[] args) 
	{
		System.out.print("Enter a number ");
		
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		
		System.out.println("The factorial of "+ a + " is "+fAct(a));
	}
}

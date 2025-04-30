import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner num= new Scanner(System.in);
		int a=num.nextInt();
		
		if (a%2==0)
		{
		    System.out.println(a+" is an even number");
		}
		else{
		    System.out.println(a+" is an odd number");
		}
	}
}

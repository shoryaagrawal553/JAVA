import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("enter ");
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=10)
		{
		    int prod= i*n;
		    System.out.println(prod);
		    sum+=prod;
		    i++;
		}
		System.out.println("sum is " + sum);
	}
}

/* enter 4
1  
2 3  
4 5 6  
7 8 9 10   */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		
		Scanner sn= new Scanner(System.in);
		
		System.out.print("enter ");
		
		int n=sn.nextInt();
		
		int temp=1;
		for(int i = 1; i<=n; i++)
		{
		    for(int j=1; j<=i; j++)
		    {
		        System.out.print(temp+" ");
		        temp++;
		    }
		    System.out.println(" ");
		}
	}
}

import java.util.Scanner;

public class Main 
{
    static int max(int a, int b)
    {
        if(a>b)
        {
           return a; 
        }
        
        else
        {
            return b;
        }
    }
    
    public static void main (String[] args) 
    {
        System.out.print("enter two numbers ");
        Scanner sc= new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        System.out.println("The greatest number is " + max(a,b));
    }
}

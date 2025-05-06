import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("enter a number ");
        Scanner sn= new Scanner(System.in);
        
        int n= sn.nextInt();
        
        int i=1;
        while( i<=10)
        {
            System.out.println(n*i);
            i++;
        }
    }
    
};

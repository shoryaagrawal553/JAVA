import java.util.Scanner;

class Main
{
    public static void main(String aegs[])
    {
        System.out.println("Enter the temp");
        
        Scanner sc = new Scanner(System.in);
        
        float temp = sc.nextFloat();
        
        
        if(temp<0)
        {
            System.out.println("Freezing warning");
        }
        
        else if (temp>0 && temp<= 20)
        {
            System.out.println("Cold");
        }
        
        else if (temp>20 && temp<= 35)
        {
            System.out.println("Normal");
        }
        
        else 
        {
            System.out.println("Heat Alert");
        }
    }
};

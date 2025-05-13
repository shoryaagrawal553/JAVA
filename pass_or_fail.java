import java.util.Scanner;

class Main
{
    public static void main (String args[])
    {
        System.out.println("Enter your marks and attendence percentage");
        
        Scanner sc = new Scanner(System.in);
        
        int mark= sc.nextInt();
        int att= sc.nextInt();
        
        if (mark<40 || att<75)
        {
            System.out.println("FAIL");
        }
        else
        {
            System.out.println("PASS");
        }
    }
};

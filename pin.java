import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your pin ");
        String pin = sc.nextLine();
        String opin= "sh122";
        
        if(pin==opin)
        {
            System.out.print(pin+ " is correct ");
        }
        else{
            System.out.println(pin+ " is incorrect");
        }
        
    }
}

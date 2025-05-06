import java.util.Scanner;

class Main 
{
    public static void main(String args[])
    {
    
    System.out.println("Enter your credit score and salary ");
    
    Scanner sc = new Scanner(System.in);
    
    int cred= sc.nextInt();
    int sal = sc.nextInt();
    
    if(cred>=750 && sal >= 60000 )
    {
        System.out.println("Loan approved");
    }
    
    else if (cred>600 && cred<750 && sal >= 60000 )
    {
        System.out.println("Loan under review");
    }
    
    else 
    {
        System.out.println("Loan rejected");
    }
}
};

import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        int age;
        System.out.println("enter your age ");
        Scanner A=new Scanner(System.in);
        age=A.nextInt();
        if(age>=18)
        {
            System.out.println("you are allowed to vote ");
        }
    }
}

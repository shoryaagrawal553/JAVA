import java.util.Scanner;

public class Main
{
    public static void main (String[] args) 
    {
        int[] arr={3,8,9,15,16};
        int n= 5;
        int st=0, en=n-1;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter the target: ");
        int tar= sc.nextInt();
        
        while(st<en)
        {
            int sum=arr[st]+arr[en];
            
            if(sum==tar){
                System.out.print("elements found at index "+ st +", "+en);
                return;
            }
            
            else if(tar < sum )
            {
                en--;
            }
            else{
                st++;
            }
        }
        
        System.out.print("element not found ");
    }
}

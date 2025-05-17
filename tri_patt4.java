/* Enter the Number:4
1  
0 1  
1 0 1  
0 1 0 1   */

import java.util.Scanner;
class Main {
    public static void main(String[] s) {
        
        System.out.print("Enter the Number:");
        Scanner sn=new Scanner(System.in);
        
        int n= sn.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
             System.out.println(" ");
        }
    }
}

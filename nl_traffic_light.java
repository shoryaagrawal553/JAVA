import java.util.Scanner;

class Main 
{
    public static void main(String args[])
    {
        System.out.println("input a color ");
        
        Scanner sc= new Scanner(System.in);
        
        String color = sc.nextLine();
        
        if(color.equals("red"))
        {
            System.out.println("STOP");
        }    
            
        else if(color.equals("green"))
        {
            System.out.println("GO");
        }
        
        else if(color.equals("yellow"))
        {
             System.out.println("START");
        }
            
        else
        {
            System.out.println("invalid input");
        }    
            
        
        
        // switch (color)
        // {
        //     case "red":
        //     System.out.println("STOP");
        //     break;
            
        //     case "yellow":
        //     System.out.println("START");
        //     break;   
            
        //     case "green":
        //     System.out.println("GO");
        //     break;
            
        //     default:
        //     System.out.println("invalid input");
        // }
    }
};

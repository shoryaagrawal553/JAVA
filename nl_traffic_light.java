import java.util.Scanner;

// Main class
class Main 
{
    public static void main(String args[])
    {
        // Prompt the user to input a color
        System.out.println("input a color ");
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the user's input and store it in the 'color' variable
        String color = sc.nextLine();
        
        // Check if the input is "red"
        if(color.equals("red"))
        {
            System.out.println("STOP"); // Output for red light
        }    
        // Check if the input is "green"
        else if(color.equals("green"))
        {
            System.out.println("GO"); // Output for green light
        }
        // Check if the input is "yellow"
        else if(color.equals("yellow"))
        {
            System.out.println("START"); // Output for yellow light
        }
        // If the input doesn't match any traffic light color
        else
        {
            System.out.println("invalid input"); // Output for invalid input
        }    
        
        // The following code is commented out. It shows how to do the same checks using a switch statement.
        /*
        switch (color)
        {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("START");
                break;   
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("invalid input");
        }
        */
    }
};

import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
      System.out.println("Enter the units");
      
      Scanner sc= new Scanner(System.in);
      int unit= sc.nextInt();
      
      if(unit>0 && unit<=100)
      {
          System.out.println("Eletricity bill: "+ unit*0.50);
      }
      
      else if(unit>100 && unit<= 300 )
      {
          System.out.println("Eletricity bill: "+ unit*0.75);
      }
      
      else 
      {
          System.out.println("Eletricity bill: "+ unit*1.20);
      }
  }
};

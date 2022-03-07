package exercise1;

import java.text.NumberFormat;
import java.util.Scanner;


public class UniTester 
{
    
    
    public static void main(String[] args) 
    {
      UEmployee emp1 = new UEmployee("Bruce", "Wayne", (double) 2000);  
      Faculty emp2 = new Faculty("Peter", "Parker", (double) 150, "Web Developement");
      Staff emp3 = new Staff("Darth", "Vader", (double) 600, "Full time Professor");
      
      Scanner input = new Scanner(System.in);
      
      String action;
      int empNum;
      double payR;
      
      UEmployee emp = emp1;
     do
     { 
      System.out.println("\nEmployee\\Pay\\Quit");
      System.out.println("Enter choice: ");
      action = input.next();
     
      if(!action.equalsIgnoreCase("Q"))
      {
          System.out.println("Enter Employee number (1, 2, or 3): ");
         empNum = input.nextInt();
         switch(empNum)
         {
             case 1: emp = emp1;break;
             case 2: emp = emp2;break;
             case 3: emp = emp3;break;
         }
         if(action.equalsIgnoreCase("E"))
         {
             System.out.println(emp);
         }
         else if(action.equalsIgnoreCase("P"))
         {
            System.out.println("" );
            payR = input.nextDouble();
            payEmployee(emp, payR);
         }
      }
     }while(!action.equalsIgnoreCase("Q"));
    }

}

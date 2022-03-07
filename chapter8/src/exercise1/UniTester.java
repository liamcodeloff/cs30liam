package exercise1;

import java.text.NumberFormat;
import java.util.Scanner;


public class UniTester 
{
    public static void payEmployee(UEmployee emp, double payR)
    {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double pay;
        
        System.out.println(emp);
        pay = emp.pay(payR);
        System.out.println(money.format(pay));
        
    }
    
    public static void main(String[] args) 
    {
      UEmployee emp1 = new UEmployee("Bruce", "Wayne", (double) 2000);  
      Faculty emp2 = new Faculty("Peter", "Parker", (double) 150, "Web Developement");
      Staff emp3 = new Staff("Darth", "Vader", (double) 600, "Full time");
      
      Scanner input = new Scanner(System.in);
      
      String action;
      int empNum;
      double payR;
      
      Employee emp = emp1;
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
            System.out.println("Enter the hours for associate OR pay period for manager: " );
            payR = input.nextDouble();
            payEmployee(emp, payR);
         }
      }
     }while(!action.equalsIgnoreCase("Q"));
    }

}

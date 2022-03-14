/*

Program: Associate.java          Last Date of this Revision: 13-Oct-2020

Purpose: 

Author: Your Name 
School: CHH
Course: Computer Programming ??
 

*/

package salescenter;

public class Associate extends Employee
{
    double hourlyPayRate;
    
   public Associate(String fName, String lName, double rate)
   {
       super(fName, lName);
       hourlyPayRate = rate;
   }
   
   public double getRate()
   {
       return hourlyPayRate;
   }
   
   public double pay(double hours)
   {
       double payEarned;
       payEarned = hourlyPayRate*hours;
       return payEarned;
   }
   
   public String toString()
    {
        return(super.toString()+", associate");
    }
}

/* Screen Dump
 

 
 */
